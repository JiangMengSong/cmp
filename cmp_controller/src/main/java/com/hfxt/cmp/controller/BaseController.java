package com.hfxt.cmp.controller;

import com.hfxt.cmp.model.Employee;

import javax.servlet.http.HttpSession;

public class BaseController {
    private PowerUtil power;
    protected final String toLogin = "redirect:/employee/login/toLogin.html";
    protected final String toNotPowerJsp = "not_power";

    public BaseController(HttpSession session) {
        power = new PowerUtil((Employee)session.getAttribute("emp"),this);

    }

    public PowerUtil getPower() {
        return power;
    }
}
