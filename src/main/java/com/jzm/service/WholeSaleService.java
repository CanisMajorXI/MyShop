package com.jzm.service;

import com.jzm.model.Merchandise;
import com.jzm.model.MerchandiseType;
import com.jzm.model.TernaryModel;
import com.jzm.model.WholesaleRecord;
import javafx.util.Pair;

import java.util.List;

public interface WholeSaleService {

    void wholesaleMerchandises(List<Pair<Integer,Integer>>pairs);

    void doWholeSale(List<Integer> idList);

    List<TernaryModel<WholesaleRecord,Merchandise,MerchandiseType>> wholesaleRecordQuery();

}
