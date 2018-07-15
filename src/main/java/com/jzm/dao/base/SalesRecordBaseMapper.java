package com.jzm.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jzm.model.SalesRecord;
/**
*  @author zqw
*/
public interface SalesRecordBaseMapper {

    int insertSalesRecord(SalesRecord object);

    int updateSalesRecord(SalesRecord object);

    int update(SalesRecord.UpdateBuilder object);

    List<SalesRecord> querySalesRecord(SalesRecord object);

    SalesRecord querySalesRecordLimit1(SalesRecord object);

}