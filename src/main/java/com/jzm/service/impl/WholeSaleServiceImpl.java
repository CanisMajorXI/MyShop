package com.jzm.service.impl;

import com.jzm.dao.MerchandiseMapper;
import com.jzm.dao.MerchandiseTypeMapper;
import com.jzm.dao.WholesaleRecordMapper;
import com.jzm.model.Merchandise;
import com.jzm.model.MerchandiseType;
import com.jzm.model.TernaryModel;
import com.jzm.model.WholesaleRecord;
import com.jzm.service.WholeSaleService;
import javafx.util.Pair;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Service
public class WholeSaleServiceImpl implements WholeSaleService {
    @Resource
    private MerchandiseMapper merchandiseMapper = null;
    @Resource
    private MerchandiseTypeMapper merchandiseTypeMapper = null;
    @Resource
    private WholesaleRecordMapper wholesaleRecordMapper = null;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
    @Override
    public void doWholeSale(List<Integer> idList) {
        Integer batchId = new Random().nextInt(999999999) + 1;
        Merchandise queryMerch = Merchandise.QueryBuild().idList(idList).fetchAll().build();
        List<Merchandise> merchandiseList = merchandiseMapper.queryMerchandise(queryMerch);
        merchandiseMapper.update(new Merchandise.UpdateBuilder()
                .set(Merchandise.Build().valid(0).build())
                .where(Merchandise.ConditionBuild().idList(idList).build())
                .build());
        for (Integer id : idList) {
            WholesaleRecord wholesaleRecord = WholesaleRecord.Build()
                    .id(batchId)
                    .merchandiseId(id)
                    .date(LocalDate.now())
                    .build();
            wholesaleRecordMapper.insertWholesaleRecord(wholesaleRecord);
        }
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
    @Override
    public void wholesaleMerchandises(List<Pair<Integer, Integer>> pairs) {
        Integer batchId = new Random().nextInt(999999999) + 1;
        for (Pair<Integer, Integer> pair : pairs) {
            Integer typeId = pair.getKey();
            Integer count = pair.getValue();
            Merchandise queryMerchandise = Merchandise.QueryBuild()
                    .fetchId()
                    .typeId(typeId)
                    .valid(1)
                    .build();
            List<Merchandise> merchandiseList = merchandiseMapper.queryMerchandise(queryMerchandise);
            if (merchandiseList.size() < count) {
                throw new RuntimeException("商品" + typeId + "库存数量不够！");
            }
            while (merchandiseList.size() > count) {
                merchandiseList.remove(merchandiseList.size() - 1);
            }
            List<Integer> idList = new ArrayList<>();
            for (Merchandise _merchandise : merchandiseList) {
                idList.add(_merchandise.getId());
            }
            Merchandise.UpdateBuilder updateBuilder = Merchandise.UpdateBuild()
                    .where(Merchandise.ConditionBuild().idList(idList).build())
                    .set(Merchandise.Build().valid(0).build())
                    .build();
            merchandiseMapper.update(updateBuilder);
            for (Integer id : idList) {
                WholesaleRecord wholesaleRecord = WholesaleRecord.Build()
                        .id(batchId)
                        .merchandiseId(id)
                        .date(LocalDate.now())
                        .build();
                wholesaleRecordMapper.insertWholesaleRecord(wholesaleRecord);
            }
        }


        //Merchandise merchandise = Merchandise.UpdateBuild().
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
    @Override
    public List<TernaryModel<WholesaleRecord, Merchandise, MerchandiseType>> wholesaleRecordQuery() {
        List<TernaryModel<WholesaleRecord, Merchandise, MerchandiseType>> ternaryModels = new ArrayList<>();

        List<WholesaleRecord> wholesaleRecordList = wholesaleRecordMapper
                .queryWholesaleRecord(WholesaleRecord
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

        for (WholesaleRecord wholesaleRecord : wholesaleRecordList) {
            for (Merchandise merchandise : merchandiseList) {
                if (wholesaleRecord.getMerchandiseId().equals(merchandise.getId())) {
                    for (MerchandiseType merchandiseType : merchandiseTypeList) {
                        if (merchandise.getTypeId().equals(merchandiseType.getId())) {
                            TernaryModel<WholesaleRecord, Merchandise, MerchandiseType> ternaryModel = new TernaryModel<WholesaleRecord, Merchandise, MerchandiseType>(wholesaleRecord, merchandise, merchandiseType);
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
