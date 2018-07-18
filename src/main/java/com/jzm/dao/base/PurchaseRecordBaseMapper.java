package com.jzm.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jzm.model.PurchaseRecord;
import org.springframework.stereotype.Repository;

/**
*  @author zqw
*/
@Repository
public interface PurchaseRecordBaseMapper {

    int insertPurchaseRecord(PurchaseRecord object);

    int updatePurchaseRecord(PurchaseRecord object);

    int update(PurchaseRecord.UpdateBuilder object);

    List<PurchaseRecord> queryPurchaseRecord(PurchaseRecord object);

    PurchaseRecord queryPurchaseRecordLimit1(PurchaseRecord object);

}