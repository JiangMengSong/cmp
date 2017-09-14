package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {

    /**
     * 添加员工信息
     */
    int addEmployee(@Param("emp") Employee emp);

    /**
     * 登录方法
     */
    Employee getEmployeeByName(@Param("loginName") String loginName);

    /**
     * 获取所有员工信息
     */
    List<Employee> getEmployee();

    /**
     * 根据Id获取指定员工信息
     * @param empId 员工id
     * @return
     */
    Employee getEmpById(@Param("empId") Integer empId);

    /**
     * 删除员工方法
     */
    int delEmployee(@Param("map")Map<String,Object> map);

    /**
     * 修改员工信息
     */
    int updateEmployee(@Param("emp")Employee emp);
}