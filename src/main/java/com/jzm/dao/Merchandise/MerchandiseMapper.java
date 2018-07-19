package com.jzm.dao.Merchandise;

import com.jzm.dao.base.MerchandiseBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
*  @author zqw
*/

public interface MerchandiseMapper extends MerchandiseBaseMapper{
    void invalidInBulk(@Param("typeId") Integer typeId, @Param("count") Integer count);
    Integer getCountByTypeId(@Param("typeId") Integer typeId);
}