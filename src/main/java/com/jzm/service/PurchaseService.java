package com.jzm.service;

import com.jzm.model.Merchandise;

import java.util.List;

public interface PurchaseService {

    void purchaseMerchandises(List<Merchandise> merchandiseList);
}
