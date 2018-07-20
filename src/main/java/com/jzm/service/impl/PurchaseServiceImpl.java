package com.jzm.service.impl;

import com.jzm.dao.MerchandiseMapper;
import com.jzm.dao.MerchandiseTypeMapper;
import com.jzm.dao.PurchaseRecordMapper;
import com.jzm.model.Merchandise;
import com.jzm.model.MerchandiseType;
import com.jzm.model.PurchaseRecord;
import com.jzm.model.TernaryModel;
import com.jzm.service.PurchaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Resource
    private MerchandiseMapper merchandiseMapper = null;

    @Resource
    private PurchaseRecordMapper purchaseRecordMapper = null;

    @Resource
    private MerchandiseTypeMapper merchandiseTypeMapper= null;

    @Override
    public List<TernaryModel<PurchaseRecord, Merchandise, MerchandiseType>> purchaseRecordQuery() {
        List<TernaryModel<PurchaseRecord, Merchandise, MerchandiseType>> ternaryModels = new ArrayList<>();

        List<PurchaseRecord> purchaseRecordList = purchaseRecordMapper
                .queryPurchaseRecord(PurchaseRecord
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

        for (PurchaseRecord purchaseRecord : purchaseRecordList) {
            for (Merchandise merchandise : merchandiseList) {
                if (purchaseRecord.getMerchandiseId().equals(merchandise.getId())) {
                    for (MerchandiseType merchandiseType : merchandiseTypeList) {
                        if (merchandise.getTypeId().equals(merchandiseType.getId())) {
                            TernaryModel<PurchaseRecord, Merchandise, MerchandiseType> ternaryModel = new TernaryModel<PurchaseRecord, Merchandise, MerchandiseType>(purchaseRecord, merchandise, merchandiseType);
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

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    @Override
    public void purchaseMerchandises(List<Merchandise> merchandiseList) {
        Integer batchId = null;
        LocalDateTime localDateTime = LocalDateTime.now();
        for (Merchandise merchandise : merchandiseList) {
            System.out.println("-----------------"+merchandise.getTypeId()+"----------------");
            merchandise.setValid(1);
            merchandiseMapper.insertMerchandise(merchandise);
            if(batchId == null) {
                batchId = merchandise.getId();
            }
            PurchaseRecord purchaseRecord = new PurchaseRecord.Builder()
                    .merchandiseId(merchandise.getId())
                    .date(localDateTime)
                    .id(batchId).build();
            purchaseRecordMapper.insertPurchaseRecord(purchaseRecord);
        }
        
        
        //LocalDate date = System.currentTimeMillis();
    }
}
