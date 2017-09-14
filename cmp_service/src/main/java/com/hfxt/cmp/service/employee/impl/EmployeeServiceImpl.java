package com.hfxt.cmp.service.employee.impl;

import com.hfxt.cmp.model.Employee;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.employee.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("employeeService")
public class EmployeeServiceImpl extends BaseService implements EmployeeService {
    @Override
    public Employee getEmployeeByName(String loginName) {
        return employeeMapper.getEmployeeByName(loginName);
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeMapper.getEmployee();
    }

    @Override
    public Employee getEmpById(Integer empId) {
        return employeeMapper.getEmpById(empId);
    }

    @Override
    public int addEmployee(Employee emp) {
        return employeeMapper.addEmployee(emp);
    }

    @Override
    public int delEmployee(Integer empId) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("empId",empId);
        map.put("delCount",0);
        employeeMapper.delEmployee(map);
        return (Integer)(map.get("delCount"));
    }

    @Override
    public int updateEmployee(Employee emp) {
        return employeeMapper.updateEmployee(emp);
    }
}
