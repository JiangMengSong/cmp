package com.hfxt.cmp.service.employee;

import com.hfxt.cmp.model.Employee;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EmployeeService {
    Employee getEmployeeByName(String loginName);
}
