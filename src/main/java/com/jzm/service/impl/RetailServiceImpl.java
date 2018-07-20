package com.jzm.service.impl;

import com.jzm.dao.*;
import com.jzm.model.*;
import com.jzm.service.RetailService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class RetailServiceImpl implements RetailService {

    @Resource
    private MerchandiseMapper merchandiseMapper = null;

    @Resource
    private RetailRecordMapper retailRecordMapper = null;

    @Resource
    private MerchandiseTypeMapper merchandiseTypeMapper = null;

    @Resource
    private VipMapper vipMapper = null;

    @Resource
    private VipTypeMapper vipTypeMapper = null;



    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    @Override
    public void doRetail(Integer typeId, Integer salesman, Integer vipId) {
        Merchandise queryMerchandise = Merchandise.QueryBuilder
                .QueryBuild()
                .fetchId().typeId(typeId).valid(1).build();
        Merchandise merchandise = merchandiseMapper.queryMerchandiseLimit1(queryMerchandise);
        if (merchandise == null) throw new RuntimeException("该商品没有库存！");
        MerchandiseType merchandiseType = merchandiseTypeMapper
                .queryMerchandiseTypeLimit1(MerchandiseType.QueryBuild()
                        .id(merchandise.getTypeId())
                        .fetchAll()
                        .build());
        Merchandise.UpdateBuilder builder = Merchandise.UpdateBuild()
                .set(Merchandise.Build().valid(0).build())
                .where(Merchandise.ConditionBuild().idList(merchandise.getId()).build())
                .build();
        BigDecimal purchasePrice = merchandiseType.getPurchasePrice();
        if (vipId != null) {
            Vip vip = vipMapper.queryVipLimit1(Vip.QueryBuild().fetchId().id(vipId).build());
            VipType vipType = vipTypeMapper.queryVipTypeLimit1(VipType.QueryBuild().fetchAll().id(vip.getTypeId()).build());
            purchasePrice = purchasePrice.multiply(new BigDecimal(vipType.getDiscount()));
        }
        merchandiseMapper.update(builder);
        RetailRecord retailRecord = RetailRecord.Build()
                .merchandiseId(merchandise.getId())
                .date(LocalDate.now())
                .vipid(vipId)
                .salesmenId(salesman)
                .realPrice(purchasePrice)
                .merchandiseId(merchandise.getId())
                .date(LocalDate.now())
                .build();
        retailRecordMapper.insertRetailRecord(retailRecord);
    }

    @Override
    public List<TernaryModel<RetailRecord, Merchandise, MerchandiseType>> queryRetailRecord() {
        List<TernaryModel<RetailRecord, Merchandise, MerchandiseType>> ternaryModels = new ArrayList<>();

        List<RetailRecord> retailRecordList = retailRecordMapper
                .queryRetailRecord(RetailRecord
                        .QueryBuild()
                        .fetchAll()
                        .build());
        List<Merchandise> merchandiseList = merchandiseMapper
                .queryMerchandise(Merchandise
                        .QueryBuild()
                        .fetchAll()
                        .build());
        List<MerchandiseType> merchandiseTypeList = merchandiseTypeMapper
                .queryMerchandiseType(MerchandiseType
                        .QueryBuild()
                        .fetchAll()
                        .build());

        for (RetailRecord retailRecord : retailRecordList) {
            for (Merchandise merchandise : merchandiseList) {
                if (retailRecord.getMerchandiseId().equals(merchandise.getId())) {
                    for (MerchandiseType merchandiseType : merchandiseTypeList) {
                        if (merchandise.getTypeId().equals(merchandiseType.getId())) {
                            TernaryModel<RetailRecord, Merchandise, MerchandiseType> ternaryModel = new TernaryModel<RetailRecord, Merchandise, MerchandiseType>(retailRecord, merchandise, merchandiseType);
                            ternaryModels.add(ternaryModel);
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return ternaryModels;
    }
}
