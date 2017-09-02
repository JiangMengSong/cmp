package com.hfxt.cmp.service.employee.impl;

import com.hfxt.cmp.model.Employee;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.employee.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
