package com.hfxt.cmp.controller;

import com.hfxt.cmp.model.Employee;

import javax.servlet.http.HttpSession;

public class BaseController {
    private PowerUtil power;
    protected final String toLogin = "redirect:/employee/login/toLogin.html";
    private String toJsp;

    public BaseController(HttpSession session) {
        power = new PowerUtil((Employee)session.getAttribute("emp"),this);
        isNotPower(null);
    }

    public PowerUtil getPower() {
        return power;
    }

    public String getToJsp() {
        return toJsp;
    }

    public void isNotPower(Boolean isPower){
        this.toJsp = "";
        if (!this.power.isSel()) this.toJsp = "not_power";
        if (null != isPower && !isPower) this.toJsp = "not_power";
    }
}
