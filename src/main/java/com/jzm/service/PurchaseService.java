package com.jzm.service;

import com.jzm.model.Merchandise;
import com.jzm.model.MerchandiseType;
import com.jzm.model.PurchaseRecord;
import com.jzm.model.TernaryModel;

import java.util.List;

public interface PurchaseService {

    void purchaseMerchandises(List<Merchandise> merchandiseList);

    List<TernaryModel<PurchaseRecord, Merchandise, MerchandiseType>> purchaseRecordQuery();
}
