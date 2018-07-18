package com.jzm.service.impl;

import com.jzm.dao.MerchandiseMapper;
import com.jzm.dao.MerchandiseTypeMapper;
import com.jzm.model.Merchandise;
import com.jzm.model.MerchandiseType;
import com.jzm.service.RepositoryQueryService;
import javafx.util.Pair;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class RepositoryQueryServiceImpl implements RepositoryQueryService {

    @Resource
    private MerchandiseMapper merchandiseMapper = null;

    @Resource
    private MerchandiseTypeMapper merchandiseTypeMapper = null;


    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    @Override
    public List<Pair<Merchandise,MerchandiseType>> queryAll() {
        List<Pair<Merchandise,MerchandiseType>> modelPairs = new ArrayList<>();
        MerchandiseType _merchandiseType = MerchandiseType.QueryBuild().fetchAll().build();
        Merchandise _merchandise = Merchandise.QueryBuild().fetchAll().build();
        List<MerchandiseType> merchandiseTypeList = merchandiseTypeMapper.queryMerchandiseType(_merchandiseType);
        List<Merchandise> merchandiseList = merchandiseMapper.queryMerchandise(_merchandise);
        for (Merchandise merchandise : merchandiseList) {
            for (MerchandiseType merchandiseType : merchandiseTypeList) {
                if (merchandise.getTypeId().equals(merchandiseType.getId())) {
                    Pair<Merchandise,MerchandiseType> modelPair = new Pair<Merchandise,MerchandiseType>(merchandise,merchandiseType);
                    modelPairs.add(modelPair);
                    break;
                }
            }
        }
        return modelPairs;
    }
}
