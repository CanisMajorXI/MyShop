package com.jzm.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jzm.model.Merchandise;
import org.springframework.stereotype.Repository;

/**
*  @author zqw
*/
@Repository
public interface MerchandiseBaseMapper {

    int insertMerchandise(Merchandise object);

    int updateMerchandise(Merchandise object);

    int update(Merchandise.UpdateBuilder object);

    List<Merchandise> queryMerchandise(Merchandise object);

    Merchandise queryMerchandiseLimit1(Merchandise object);

}