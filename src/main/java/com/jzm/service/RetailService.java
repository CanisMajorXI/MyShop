package com.jzm.service;

import com.jzm.model.RetailRecord;

import java.util.List;

public interface RetailService {

    void doRetail(Integer typeId,Integer salesman,Integer vipId);

    List<RetailRecord> queryRetailRecord();
}
