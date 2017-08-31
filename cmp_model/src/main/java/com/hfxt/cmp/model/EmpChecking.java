package com.hfxt.cmp.model;

import java.util.Date;

public class EmpChecking {
    private Integer empcheckingid;

    private Employee employee;

    private Date chetime;

    private Integer chestatus;

    private String empcheckdesc;

    public Integer getEmpcheckingid() {
        return empcheckingid;
    }

    public void setEmpcheckingid(Integer empcheckingid) {
        this.empcheckingid = empcheckingid;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getChetime() {
        return chetime;
    }

    public void setChetime(Date chetime) {
        this.chetime = chetime;
    }

    public Integer getChestatus() {
        return chestatus;
    }

    public void setChestatus(Integer chestatus) {
        this.chestatus = chestatus;
    }

    public String getEmpcheckdesc() {
        return empcheckdesc;
    }

    public void setEmpcheckdesc(String empcheckdesc) {
        this.empcheckdesc = empcheckdesc == null ? null : empcheckdesc.trim();
    }
}