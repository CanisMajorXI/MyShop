package com.jzm.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jzm.model.VipType;
import org.springframework.stereotype.Repository;

/**
*  @author zqw
*/
@Repository
public interface VipTypeBaseMapper {

    int insertVipType(VipType object);

    int updateVipType(VipType object);

    int update(VipType.UpdateBuilder object);

    List<VipType> queryVipType(VipType object);

    VipType queryVipTypeLimit1(VipType object);

}