package com.jzm.service;

import com.jzm.model.Merchandise;
import com.jzm.model.MerchandiseType;
import com.jzm.model.RetailRecord;
import com.jzm.model.TernaryModel;

import java.util.List;

public interface RetailService {

    void doRetail(Integer typeId,Integer salesman,Integer vipId);

    List<TernaryModel<RetailRecord, Merchandise, MerchandiseType>> queryRetailRecord();
}
