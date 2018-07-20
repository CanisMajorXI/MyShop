package com.jzm.service.impl;

import com.jzm.dao.SalesmanMapper;
import com.jzm.model.Salesman;
import com.jzm.service.SalesmanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SalesmanServiceImpl implements SalesmanService{

    @Resource
    private SalesmanMapper salesmanMapper = null;
    @Override
    public List<Salesman> querySalesman() {
        return salesmanMapper.querySalesman(Salesman.QueryBuild().fetchAll().build());
    }
}
