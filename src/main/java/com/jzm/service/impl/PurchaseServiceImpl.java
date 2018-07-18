package com.jzm.service.impl;

import com.jzm.dao.MerchandiseMapper;
import com.jzm.dao.PurchaseRecordMapper;
import com.jzm.model.Merchandise;
import com.jzm.model.PurchaseRecord;
import com.jzm.service.PurchaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Resource
    private MerchandiseMapper merchandiseMapper = null;

    @Resource
    private PurchaseRecordMapper purchaseRecordMapper = null;

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
