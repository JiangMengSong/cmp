package com.hfxt.cmp.controller;

import com.hfxt.cmp.model.Employee;

import javax.servlet.http.HttpSession;

public class BaseController {
    protected Employee employee;

    protected final String toLogin = "redirect:/employee/login/toLogin.html";

    public BaseController(HttpSession session) {
        this.employee = (Employee)session.getAttribute("emp");
    }
}
