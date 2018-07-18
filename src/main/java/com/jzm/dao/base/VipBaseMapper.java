package com.jzm.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jzm.model.Vip;
import org.springframework.stereotype.Repository;

/**
*  @author zqw
*/
@Repository
public interface VipBaseMapper {

    int insertVip(Vip object);

    int updateVip(Vip object);

    int update(Vip.UpdateBuilder object);

    List<Vip> queryVip(Vip object);

    Vip queryVipLimit1(Vip object);

}