package com.jzm.model;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jzm.util.LocalDateDeserializer;
import com.jzm.util.LocalDateSerializer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author zqw
*/
public class RetailRecord implements Serializable {

    private static final long serialVersionUID = 1531886203653L;


    /**
    * 主键
    * 销售单号id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 销售的商品的id
    * isNullAble:0
    */
    private Integer merchandiseId;

    /**
    * 销售时间
    * isNullAble:0
    */
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private java.time.LocalDate date;

    /**
    * 买家的vipId，如果不是vip则为空
    * isNullAble:1
    */
    private Integer vipid;

    /**
    * 实际销售价格
    * isNullAble:0
    */
    private java.math.BigDecimal realPrice;

    /**
    * 销售员id
    * isNullAble:0
    */
    private Integer salesmenId;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setMerchandiseId(Integer merchandiseId){this.merchandiseId = merchandiseId;}

    public Integer getMerchandiseId(){return this.merchandiseId;}

    public void setDate(java.time.LocalDate date){this.date = date;}

    public java.time.LocalDate getDate(){return this.date;}

    public void setVipid(Integer vipid){this.vipid = vipid;}

    public Integer getVipid(){return this.vipid;}

    public void setRealPrice(java.math.BigDecimal realPrice){this.realPrice = realPrice;}

    public java.math.BigDecimal getRealPrice(){return this.realPrice;}

    public void setSalesmenId(Integer salesmenId){this.salesmenId = salesmenId;}

    public Integer getSalesmenId(){return this.salesmenId;}
    @Override
    public String toString() {
        return "RetailRecord{" +
                "id='" + id + '\'' +
                "merchandiseId='" + merchandiseId + '\'' +
                "date='" + date + '\'' +
                "vipid='" + vipid + '\'' +
                "realPrice='" + realPrice + '\'' +
                "salesmenId='" + salesmenId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private RetailRecord set;

        private ConditionBuilder where;

        public UpdateBuilder set(RetailRecord set){
            this.set = set;
            return this;
        }

        public RetailRecord getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends RetailRecord{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> merchandiseIdList;

        public List<Integer> getMerchandiseIdList(){return this.merchandiseIdList;}

        private Integer merchandiseIdSt;

        private Integer merchandiseIdEd;

        public Integer getMerchandiseIdSt(){return this.merchandiseIdSt;}

        public Integer getMerchandiseIdEd(){return this.merchandiseIdEd;}

        private List<java.time.LocalDate> dateList;

        public List<java.time.LocalDate> getDateList(){return this.dateList;}

        private java.time.LocalDate dateSt;

        private java.time.LocalDate dateEd;

        public java.time.LocalDate getDateSt(){return this.dateSt;}

        public java.time.LocalDate getDateEd(){return this.dateEd;}

        private List<Integer> vipidList;

        public List<Integer> getVipidList(){return this.vipidList;}

        private Integer vipidSt;

        private Integer vipidEd;

        public Integer getVipidSt(){return this.vipidSt;}

        public Integer getVipidEd(){return this.vipidEd;}

        private List<java.math.BigDecimal> realPriceList;

        public List<java.math.BigDecimal> getRealPriceList(){return this.realPriceList;}

        private java.math.BigDecimal realPriceSt;

        private java.math.BigDecimal realPriceEd;

        public java.math.BigDecimal getRealPriceSt(){return this.realPriceSt;}

        public java.math.BigDecimal getRealPriceEd(){return this.realPriceEd;}

        private List<Integer> salesmenIdList;

        public List<Integer> getSalesmenIdList(){return this.salesmenIdList;}

        private Integer salesmenIdSt;

        private Integer salesmenIdEd;

        public Integer getSalesmenIdSt(){return this.salesmenIdSt;}

        public Integer getSalesmenIdEd(){return this.salesmenIdEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder merchandiseIdBetWeen(Integer merchandiseIdSt,Integer merchandiseIdEd){
            this.merchandiseIdSt = merchandiseIdSt;
            this.merchandiseIdEd = merchandiseIdEd;
            return this;
        }

        public QueryBuilder merchandiseIdGreaterEqThan(Integer merchandiseIdSt){
            this.merchandiseIdSt = merchandiseIdSt;
            return this;
        }
        public QueryBuilder merchandiseIdLessEqThan(Integer merchandiseIdEd){
            this.merchandiseIdEd = merchandiseIdEd;
            return this;
        }


        public QueryBuilder merchandiseId(Integer merchandiseId){
            setMerchandiseId(merchandiseId);
            return this;
        }

        public QueryBuilder merchandiseIdList(Integer ... merchandiseId){
            this.merchandiseIdList = solveNullList(merchandiseId);
            return this;
        }

        public QueryBuilder merchandiseIdList(List<Integer> merchandiseId){
            this.merchandiseIdList = merchandiseId;
            return this;
        }

        public QueryBuilder fetchMerchandiseId(){
            setFetchFields("fetchFields","merchandiseId");
            return this;
        }

        public QueryBuilder excludeMerchandiseId(){
            setFetchFields("excludeFields","merchandiseId");
            return this;
        }

        public QueryBuilder dateBetWeen(java.time.LocalDate dateSt,java.time.LocalDate dateEd){
            this.dateSt = dateSt;
            this.dateEd = dateEd;
            return this;
        }

        public QueryBuilder dateGreaterEqThan(java.time.LocalDate dateSt){
            this.dateSt = dateSt;
            return this;
        }
        public QueryBuilder dateLessEqThan(java.time.LocalDate dateEd){
            this.dateEd = dateEd;
            return this;
        }


        public QueryBuilder date(java.time.LocalDate date){
            setDate(date);
            return this;
        }

        public QueryBuilder dateList(java.time.LocalDate ... date){
            this.dateList = solveNullList(date);
            return this;
        }

        public QueryBuilder dateList(List<java.time.LocalDate> date){
            this.dateList = date;
            return this;
        }

        public QueryBuilder fetchDate(){
            setFetchFields("fetchFields","date");
            return this;
        }

        public QueryBuilder excludeDate(){
            setFetchFields("excludeFields","date");
            return this;
        }

        public QueryBuilder vipidBetWeen(Integer vipidSt,Integer vipidEd){
            this.vipidSt = vipidSt;
            this.vipidEd = vipidEd;
            return this;
        }

        public QueryBuilder vipidGreaterEqThan(Integer vipidSt){
            this.vipidSt = vipidSt;
            return this;
        }
        public QueryBuilder vipidLessEqThan(Integer vipidEd){
            this.vipidEd = vipidEd;
            return this;
        }


        public QueryBuilder vipid(Integer vipid){
            setVipid(vipid);
            return this;
        }

        public QueryBuilder vipidList(Integer ... vipid){
            this.vipidList = solveNullList(vipid);
            return this;
        }

        public QueryBuilder vipidList(List<Integer> vipid){
            this.vipidList = vipid;
            return this;
        }

        public QueryBuilder fetchVipid(){
            setFetchFields("fetchFields","vipid");
            return this;
        }

        public QueryBuilder excludeVipid(){
            setFetchFields("excludeFields","vipid");
            return this;
        }

        public QueryBuilder realPriceBetWeen(java.math.BigDecimal realPriceSt,java.math.BigDecimal realPriceEd){
            this.realPriceSt = realPriceSt;
            this.realPriceEd = realPriceEd;
            return this;
        }

        public QueryBuilder realPriceGreaterEqThan(java.math.BigDecimal realPriceSt){
            this.realPriceSt = realPriceSt;
            return this;
        }
        public QueryBuilder realPriceLessEqThan(java.math.BigDecimal realPriceEd){
            this.realPriceEd = realPriceEd;
            return this;
        }


        public QueryBuilder realPrice(java.math.BigDecimal realPrice){
            setRealPrice(realPrice);
            return this;
        }

        public QueryBuilder realPriceList(java.math.BigDecimal ... realPrice){
            this.realPriceList = solveNullList(realPrice);
            return this;
        }

        public QueryBuilder realPriceList(List<java.math.BigDecimal> realPrice){
            this.realPriceList = realPrice;
            return this;
        }

        public QueryBuilder fetchRealPrice(){
            setFetchFields("fetchFields","realPrice");
            return this;
        }

        public QueryBuilder excludeRealPrice(){
            setFetchFields("excludeFields","realPrice");
            return this;
        }

        public QueryBuilder salesmenIdBetWeen(Integer salesmenIdSt,Integer salesmenIdEd){
            this.salesmenIdSt = salesmenIdSt;
            this.salesmenIdEd = salesmenIdEd;
            return this;
        }

        public QueryBuilder salesmenIdGreaterEqThan(Integer salesmenIdSt){
            this.salesmenIdSt = salesmenIdSt;
            return this;
        }
        public QueryBuilder salesmenIdLessEqThan(Integer salesmenIdEd){
            this.salesmenIdEd = salesmenIdEd;
            return this;
        }


        public QueryBuilder salesmenId(Integer salesmenId){
            setSalesmenId(salesmenId);
            return this;
        }

        public QueryBuilder salesmenIdList(Integer ... salesmenId){
            this.salesmenIdList = solveNullList(salesmenId);
            return this;
        }

        public QueryBuilder salesmenIdList(List<Integer> salesmenId){
            this.salesmenIdList = salesmenId;
            return this;
        }

        public QueryBuilder fetchSalesmenId(){
            setFetchFields("fetchFields","salesmenId");
            return this;
        }

        public QueryBuilder excludeSalesmenId(){
            setFetchFields("excludeFields","salesmenId");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public RetailRecord build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> merchandiseIdList;

        public List<Integer> getMerchandiseIdList(){return this.merchandiseIdList;}

        private Integer merchandiseIdSt;

        private Integer merchandiseIdEd;

        public Integer getMerchandiseIdSt(){return this.merchandiseIdSt;}

        public Integer getMerchandiseIdEd(){return this.merchandiseIdEd;}

        private List<java.time.LocalDate> dateList;

        public List<java.time.LocalDate> getDateList(){return this.dateList;}

        private java.time.LocalDate dateSt;

        private java.time.LocalDate dateEd;

        public java.time.LocalDate getDateSt(){return this.dateSt;}

        public java.time.LocalDate getDateEd(){return this.dateEd;}

        private List<Integer> vipidList;

        public List<Integer> getVipidList(){return this.vipidList;}

        private Integer vipidSt;

        private Integer vipidEd;

        public Integer getVipidSt(){return this.vipidSt;}

        public Integer getVipidEd(){return this.vipidEd;}

        private List<java.math.BigDecimal> realPriceList;

        public List<java.math.BigDecimal> getRealPriceList(){return this.realPriceList;}

        private java.math.BigDecimal realPriceSt;

        private java.math.BigDecimal realPriceEd;

        public java.math.BigDecimal getRealPriceSt(){return this.realPriceSt;}

        public java.math.BigDecimal getRealPriceEd(){return this.realPriceEd;}

        private List<Integer> salesmenIdList;

        public List<Integer> getSalesmenIdList(){return this.salesmenIdList;}

        private Integer salesmenIdSt;

        private Integer salesmenIdEd;

        public Integer getSalesmenIdSt(){return this.salesmenIdSt;}

        public Integer getSalesmenIdEd(){return this.salesmenIdEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder merchandiseIdBetWeen(Integer merchandiseIdSt,Integer merchandiseIdEd){
            this.merchandiseIdSt = merchandiseIdSt;
            this.merchandiseIdEd = merchandiseIdEd;
            return this;
        }

        public ConditionBuilder merchandiseIdGreaterEqThan(Integer merchandiseIdSt){
            this.merchandiseIdSt = merchandiseIdSt;
            return this;
        }
        public ConditionBuilder merchandiseIdLessEqThan(Integer merchandiseIdEd){
            this.merchandiseIdEd = merchandiseIdEd;
            return this;
        }


        public ConditionBuilder merchandiseIdList(Integer ... merchandiseId){
            this.merchandiseIdList = solveNullList(merchandiseId);
            return this;
        }

        public ConditionBuilder merchandiseIdList(List<Integer> merchandiseId){
            this.merchandiseIdList = merchandiseId;
            return this;
        }

        public ConditionBuilder dateBetWeen(java.time.LocalDate dateSt,java.time.LocalDate dateEd){
            this.dateSt = dateSt;
            this.dateEd = dateEd;
            return this;
        }

        public ConditionBuilder dateGreaterEqThan(java.time.LocalDate dateSt){
            this.dateSt = dateSt;
            return this;
        }
        public ConditionBuilder dateLessEqThan(java.time.LocalDate dateEd){
            this.dateEd = dateEd;
            return this;
        }


        public ConditionBuilder dateList(java.time.LocalDate ... date){
            this.dateList = solveNullList(date);
            return this;
        }

        public ConditionBuilder dateList(List<java.time.LocalDate> date){
            this.dateList = date;
            return this;
        }

        public ConditionBuilder vipidBetWeen(Integer vipidSt,Integer vipidEd){
            this.vipidSt = vipidSt;
            this.vipidEd = vipidEd;
            return this;
        }

        public ConditionBuilder vipidGreaterEqThan(Integer vipidSt){
            this.vipidSt = vipidSt;
            return this;
        }
        public ConditionBuilder vipidLessEqThan(Integer vipidEd){
            this.vipidEd = vipidEd;
            return this;
        }


        public ConditionBuilder vipidList(Integer ... vipid){
            this.vipidList = solveNullList(vipid);
            return this;
        }

        public ConditionBuilder vipidList(List<Integer> vipid){
            this.vipidList = vipid;
            return this;
        }

        public ConditionBuilder realPriceBetWeen(java.math.BigDecimal realPriceSt,java.math.BigDecimal realPriceEd){
            this.realPriceSt = realPriceSt;
            this.realPriceEd = realPriceEd;
            return this;
        }

        public ConditionBuilder realPriceGreaterEqThan(java.math.BigDecimal realPriceSt){
            this.realPriceSt = realPriceSt;
            return this;
        }
        public ConditionBuilder realPriceLessEqThan(java.math.BigDecimal realPriceEd){
            this.realPriceEd = realPriceEd;
            return this;
        }


        public ConditionBuilder realPriceList(java.math.BigDecimal ... realPrice){
            this.realPriceList = solveNullList(realPrice);
            return this;
        }

        public ConditionBuilder realPriceList(List<java.math.BigDecimal> realPrice){
            this.realPriceList = realPrice;
            return this;
        }

        public ConditionBuilder salesmenIdBetWeen(Integer salesmenIdSt,Integer salesmenIdEd){
            this.salesmenIdSt = salesmenIdSt;
            this.salesmenIdEd = salesmenIdEd;
            return this;
        }

        public ConditionBuilder salesmenIdGreaterEqThan(Integer salesmenIdSt){
            this.salesmenIdSt = salesmenIdSt;
            return this;
        }
        public ConditionBuilder salesmenIdLessEqThan(Integer salesmenIdEd){
            this.salesmenIdEd = salesmenIdEd;
            return this;
        }


        public ConditionBuilder salesmenIdList(Integer ... salesmenId){
            this.salesmenIdList = solveNullList(salesmenId);
            return this;
        }

        public ConditionBuilder salesmenIdList(List<Integer> salesmenId){
            this.salesmenIdList = salesmenId;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private RetailRecord obj;

        public Builder(){
            this.obj = new RetailRecord();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder merchandiseId(Integer merchandiseId){
            this.obj.setMerchandiseId(merchandiseId);
            return this;
        }
        public Builder date(java.time.LocalDate date){
            this.obj.setDate(date);
            return this;
        }
        public Builder vipid(Integer vipid){
            this.obj.setVipid(vipid);
            return this;
        }
        public Builder realPrice(java.math.BigDecimal realPrice){
            this.obj.setRealPrice(realPrice);
            return this;
        }
        public Builder salesmenId(Integer salesmenId){
            this.obj.setSalesmenId(salesmenId);
            return this;
        }
        public RetailRecord build(){return obj;}
    }

}
