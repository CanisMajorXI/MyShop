package com.jzm.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jzm.model.WholesaleRecord;
import org.springframework.stereotype.Repository;

/**
*  @author zqw
*/
@Repository
public interface WholesaleRecordBaseMapper {

    int insertWholesaleRecord(WholesaleRecord object);

    int updateWholesaleRecord(WholesaleRecord object);

    int update(WholesaleRecord.UpdateBuilder object);

    List<WholesaleRecord> queryWholesaleRecord(WholesaleRecord object);

    WholesaleRecord queryWholesaleRecordLimit1(WholesaleRecord object);

}