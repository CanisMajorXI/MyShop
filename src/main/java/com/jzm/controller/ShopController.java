package com.jzm.controller;

import com.jzm.model.*;
import com.jzm.service.*;
import javafx.util.Pair;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
@ResponseBody
//RestFul
/*
   try {

        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "ok";
* */
@RequestMapping("/api")
public class ShopController {

    @Resource
    private MerchandiseTypeService merchandiseTypeService = null;

    @Resource
    private PurchaseService purchaseService = null;

    @Resource
    private RepositoryQueryService repositoryQueryService = null;

    @Resource
    private WholeSaleService wholeSaleService = null;

    @Resource
    private RetailService retailService = null;

    @Resource
    private VipService vipService = null;

    @Resource
    private SalesmanService salesmanService  = null;
    /*/**
     * 主键
     * 商品类型Id
     * isNullAble:0
    private Integer id;
     * 商品名称
     * isNullAble:0
    private String name;
     * 商品图片
     * isNullAble:1
    private String picture;
     * 商品有效期
     * isNullAble:0
    private Integer expiration;
     * 商品进货价格
     * isNullAble:0
    private java.math.BigDecimal purchasePrice;
     * 商品批发卖价
     * isNullAble:0
     java.math.BigDecimal wholesalePrice;
     * 商品零售价格
     * isNullAble:0 */

    private java.math.BigDecimal retailPrice;

    @PostMapping("/merchandise-type/add")
    public String addMerchandiseType(@RequestBody MerchandiseType merchandiseType) {
        try {
            merchandiseTypeService.insertMerchandiseType(merchandiseType);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "ok";
    }

    @PostMapping("/merchandise-type/query")
    public List<MerchandiseType> queryMerchandiseType(@RequestBody MerchandiseType merchandiseType) {
        try {
            return merchandiseTypeService.queryMerchandiseType(merchandiseType);
        } catch (Exception e) {
            e.printStackTrace();
            return new LinkedList<MerchandiseType>();
        }
    }

    @PostMapping("/merchandises/purchase")
    public String purchaseMerchandises(@RequestBody List<Merchandise> merchandiseList) {
        try {
            purchaseService.purchaseMerchandises(merchandiseList);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    @GetMapping("/merchandises/query")
    public List<Pair<Merchandise, MerchandiseType>> queryAll() {
        try {
            return repositoryQueryService.queryAll();
        } catch (Exception e) {
            e.printStackTrace();
            return new LinkedList<>();
        }
    }

    @PostMapping("/merchandises/wholesale")
    public String wholesale(@RequestBody List<TempPair> tempPairs) {
        try {
            List<Pair<Integer, Integer>> pairs = new ArrayList<>();
            for (TempPair tempPair : tempPairs) {
                pairs.add(new Pair<>(tempPair.getTypeId(), tempPair.getCount()));
            }
            //  System.out.println(pairs.get(0).getKey()+"         "+pairs.get(0).getKey());
            wholeSaleService.wholesaleMerchandises(pairs);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
    @GetMapping("/purchase-record/query")
    public List<TernaryModel<PurchaseRecord, Merchandise, MerchandiseType>> purchaseRecordQuery() {
        try {
            return purchaseService.purchaseRecordQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return new LinkedList<>();
        }
    }
    @GetMapping("/wholesale-record/query")
    public List<TernaryModel<WholesaleRecord, Merchandise, MerchandiseType>> wholesaleRecordQuery() {
        try {
            return wholeSaleService.wholesaleRecordQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return new LinkedList<>();
        }
    }

    @PostMapping("/merchandises/retail")
    public String merchandisesRetail(@RequestBody Param param) {
        Integer typeId = param.typeId;
        Integer salesmanId = param.salesmanId;
        Integer vipId = param.vipId;
      try {
          retailService.doRetail(typeId,salesmanId,vipId);
          return "ok";
      }catch (Exception e){
          e.printStackTrace();
          return "false";
      }
    }
    @GetMapping("/retail-record/query")
    public List<TernaryModel<RetailRecord, Merchandise, MerchandiseType>> queryRetailQuery(){
        try {
            return retailService.queryRetailRecord();
        }catch (Exception e){
            e.printStackTrace();
            return new LinkedList<>();
        }
    }
    @PostMapping("/vip-type/add")
    public String addVipType(@RequestBody VipType vipType) {
        try {
            vipService.addVipType(vipType);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }
    @GetMapping("/vip-type/query")
    public List<VipType> queryVipType() {
        try {
            return vipService.queryVipType();
        }catch (Exception e){
            e.printStackTrace();
            return new LinkedList<>();
        }
    }
    @PostMapping("/vip/add")
    public String addVipType(@RequestBody Vip vip) {
        try {
            vipService.addVip(vip);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }
    @GetMapping("/vip/query")
    public List<Pair<Vip,VipType>> queryVip() {
        try {
            return vipService.queryVip();
        }catch (Exception e){
            e.printStackTrace();
            return new LinkedList<>();
        }
    }
    @GetMapping("/staff/query")
    public List<Salesman> querySalesman(){
        try {
            return  salesmanService.querySalesman();
        } catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


    static private class TempPair {
        private Integer typeId;
        private Integer count;

        public Integer getTypeId() {
            return typeId;
        }

        public void setTypeId(Integer typeId) {
            this.typeId = typeId;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }
    static private class Param {
        public  Integer typeId;
        public Integer salesmanId;
        public Integer vipId;
    }


}
