package com.jzm.service;

import com.jzm.model.Merchandise;
import com.jzm.model.MerchandiseType;
import javafx.util.Pair;

import java.util.List;

public interface RepositoryQueryService {

    public List<Pair<Merchandise,MerchandiseType>> queryAll();
}
