package com.jzm.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jzm.model.Salesman;
import org.springframework.stereotype.Repository;

/**
*  @author zqw
*/
@Repository
public interface SalesmanBaseMapper {

    int insertSalesman(Salesman object);

    int updateSalesman(Salesman object);

    int update(Salesman.UpdateBuilder object);

    List<Salesman> querySalesman(Salesman object);

    Salesman querySalesmanLimit1(Salesman object);

}