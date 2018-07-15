package com.jzm.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jzm.model.Staff;
/**
*  @author zqw
*/
public interface StaffBaseMapper {

    int insertStaff(Staff object);

    int updateStaff(Staff object);

    int update(Staff.UpdateBuilder object);

    List<Staff> queryStaff(Staff object);

    Staff queryStaffLimit1(Staff object);

}