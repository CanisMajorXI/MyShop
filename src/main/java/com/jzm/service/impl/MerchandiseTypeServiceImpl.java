package com.jzm.service.impl;

import com.jzm.dao.MerchandiseTypeMapper;
import com.jzm.model.MerchandiseType;
import com.jzm.service.MerchandiseTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MerchandiseTypeServiceImpl implements MerchandiseTypeService {
    @Resource
    private MerchandiseTypeMapper merchandiseTypeMapper = null;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    public int insertMerchandiseType(MerchandiseType merchandiseType) {
        return merchandiseTypeMapper.insertMerchandiseType(merchandiseType);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.REPEATABLE_READ)
    @Override
    public List<MerchandiseType> queryMerchandiseType(MerchandiseType merchandiseType) {
        return merchandiseTypeMapper.queryMerchandiseType(merchandiseType);
    }

}
