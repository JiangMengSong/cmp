package com.hfxt.cmp.controller;

import com.hfxt.cmp.model.Employee;

import javax.servlet.http.HttpSession;

public class BaseController {
    protected Employee employee;
    protected boolean isLogin;

    protected final String toLogin = "redirect:/employee/login/toLogin.html";

    public BaseController(HttpSession session) {
        this.employee = (Employee)session.getAttribute("emp");
        if ( null == this.employee) this.isLogin = true;
    }
}
