package com.hfxt.cmp.service.employee;

import com.hfxt.cmp.model.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface EmployeeService {
    Employee getEmployeeByName(String loginName);

    List<Employee> getEmployee();

    Employee getEmpById(Integer empId);

    int addEmployee(Employee emp);

    int delEmployee(Integer empId);

    int updateEmployee(Employee emp);
}
