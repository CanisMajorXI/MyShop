package com.jzm.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jzm.model.RetailRecord;
import org.springframework.stereotype.Repository;

/**
*  @author zqw
*/
@Repository
public interface RetailRecordBaseMapper {

    int insertRetailRecord(RetailRecord object);

    int updateRetailRecord(RetailRecord object);

    int update(RetailRecord.UpdateBuilder object);

    List<RetailRecord> queryRetailRecord(RetailRecord object);

    RetailRecord queryRetailRecordLimit1(RetailRecord object);

}