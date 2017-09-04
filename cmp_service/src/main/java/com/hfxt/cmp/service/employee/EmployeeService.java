package com.hfxt.cmp.service.employee;

import com.hfxt.cmp.model.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface EmployeeService {
    Employee getEmployeeByName(String loginName);

    List<Employee> getEmployee();

    int delEmployee(Integer empId);
}
