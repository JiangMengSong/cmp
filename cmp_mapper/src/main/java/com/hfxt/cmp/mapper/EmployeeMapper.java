package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer empid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer empid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    /**
     * 登录方法
     * */
    Employee getEmployeeByName(@Param("loginName") String loginName);

    /**
     * 获取所有员工信息
     * */
    List<Employee> getEmployee();
}