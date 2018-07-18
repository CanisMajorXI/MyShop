package com.jzm.service.impl;

import com.jzm.dao.VipMapper;
import com.jzm.dao.VipTypeMapper;
import com.jzm.model.Vip;
import com.jzm.model.VipType;
import com.jzm.service.VipService;
import javafx.util.Pair;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class VipServiceImpl implements VipService {

    @Resource
    private VipMapper vipMapper = null;

    @Resource
    private VipTypeMapper vipTypeMapper = null;

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    @Override
    public void addVipType(VipType vipType) {
        vipTypeMapper.insertVipType(vipType);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    @Override
    public List<VipType> queryVipType() {

        return vipTypeMapper.queryVipType(VipType.QueryBuild().fetchAll().build());
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    @Override
    public void addVip(Vip vip) {
        vipMapper.insertVip(vip);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    @Override
    public List<Pair<Vip, VipType>> queryVip() {
        List<Vip> vipList = vipMapper.queryVip(Vip.QueryBuild().fetchAll().build());
        List<VipType> vipTypeList = vipTypeMapper.queryVipType(VipType.QueryBuild().fetchAll().build());
        List<Pair<Vip, VipType>> pairList = new ArrayList<>();
        for (Vip vip : vipList) {
            for (VipType vipType : vipTypeList) {
                if (vip.getTypeId().equals(vipType.getId())) {
                    pairList.add(new Pair<Vip, VipType>(vip, vipType));
                    break;
                }
            }
        }
        return pairList;
    }

}
