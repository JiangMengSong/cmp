package com.hfxt.cmp.model;

import java.util.Date;

public class Employee {
    private Integer empid;

    private String empname;

    private String loginname;

    private String loginpwd;

    private String empaddress;

    private Integer empsex;

    private Date empbirth;

    private String emphead;

    private Integer empstauts;

    private String empdesc;

    private String empqq;

    private Date empentrytime;

    private String empmajor;

    private String empemail;

    private String empphone;

    private Integer emprole;

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    public String getEmpaddress() {
        return empaddress;
    }

    public void setEmpaddress(String empaddress) {
        this.empaddress = empaddress == null ? null : empaddress.trim();
    }

    public Integer getEmpsex() {
        return empsex;
    }

    public void setEmpsex(Integer empsex) {
        this.empsex = empsex;
    }

    public Date getEmpbirth() {
        return empbirth;
    }

    public String getEmphead() {
        return emphead;
    }

    public void setEmphead(String emphead) {
        this.emphead = emphead;
    }

    public void setEmpbirth(Date empbirth) {
        this.empbirth = empbirth;
    }

    public Integer getEmpstauts() {
        return empstauts;
    }

    public void setEmpstauts(Integer empstauts) {
        this.empstauts = empstauts;
    }

    public String getEmpdesc() {
        return empdesc;
    }

    public void setEmpdesc(String empdesc) {
        this.empdesc = empdesc == null ? null : empdesc.trim();
    }

    public String getEmpqq() {
        return empqq;
    }

    public void setEmpqq(String empqq) {
        this.empqq = empqq == null ? null : empqq.trim();
    }

    public Date getEmpentrytime() {
        return empentrytime;
    }

    public void setEmpentrytime(Date empentrytime) {
        this.empentrytime = empentrytime;
    }

    public String getEmpmajor() {
        return empmajor;
    }

    public void setEmpmajor(String empmajor) {
        this.empmajor = empmajor == null ? null : empmajor.trim();
    }

    public String getEmpemail() {
        return empemail;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail == null ? null : empemail.trim();
    }

    public String getEmpphone() {
        return empphone;
    }

    public void setEmpphone(String empphone) {
        this.empphone = empphone == null ? null : empphone.trim();
    }

    public Integer getEmprole() {
        return emprole;
    }

    public void setEmprole(Integer emprole) {
        this.emprole = emprole;
    }
}