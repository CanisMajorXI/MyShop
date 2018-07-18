package com.jzm.service;

import com.jzm.model.Vip;
import com.jzm.model.VipType;
import javafx.util.Pair;

import java.util.List;

public interface VipService {

    void addVipType(VipType vipType);

    List<VipType> queryVipType();

    void addVip(Vip vip);

    List<Pair<Vip,VipType>> queryVip();

}
