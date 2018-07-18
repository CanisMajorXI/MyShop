package com.jzm.service.impl;

import com.jzm.dao.MerchandiseMapper;
import com.jzm.dao.RetailRecordMapper;
import com.jzm.model.Merchandise;
import com.jzm.service.RetailService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class RetailServiceImpl implements RetailService {

    @Resource
    private MerchandiseMapper merchandiseMapper = null;

    @Resource
    private RetailRecordMapper retailRecordMapper = null;

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    @Override
    public void doRetail(Integer typeId, Integer salesman, Integer vipId) {
        Merchandise queryMerchandise = Merchandise.QueryBuilder
                .QueryBuild()
                .fetchId().typeId(typeId).valid(1).build();
        Merchandise merchandise = merchandiseMapper.queryMerchandiseLimit1(queryMerchandise);
        if (merchandise == null) throw new RuntimeException("该商品没有库存！");
        Merchandise.UpdateBuilder builder = Merchandise.UpdateBuild()
                .set(Merchandise.Build().valid(0).build())
                .where(Merchandise.ConditionBuild().idList(merchandise.getId()).build())
                .build();
        merchandiseMapper.update(builder);

    }
}
