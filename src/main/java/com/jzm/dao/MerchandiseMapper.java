package com.jzm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jzm.model.Merchandise;
import com.jzm.dao.base.MerchandiseBaseMapper;
import org.springframework.stereotype.Repository;

/**
*  @author zqw
*/
@Repository
public interface MerchandiseMapper extends MerchandiseBaseMapper{
    void invalidInBulk(@Param("typeId") Integer typeId,@Param("count") Integer count);
    Integer getCountByTypeId(@Param("typeId") Integer typeId);
}