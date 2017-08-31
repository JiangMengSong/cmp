package com.hfxt.cmp.controller.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @RequestMapping(value = "toLogin.html",produces = "text/html;charset=utf-8")
    public String toLogin(){
        return "employee/login";
    }
}
