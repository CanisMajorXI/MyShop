package com.jzm.service;

import com.jzm.model.MerchandiseType;

import java.util.List;

public interface MerchandiseTypeService {

    int insertMerchandiseType(MerchandiseType merchandiseType);

    List<MerchandiseType> queryMerchandiseType(MerchandiseType merchandiseType);
}
