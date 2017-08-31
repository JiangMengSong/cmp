package com.hfxt.cmp.model;

import java.util.Date;

public class Clazz {
    private Integer clazzid;

    private String classname;

    private Employee employeeA;

    private Employee employeeB;

    private Integer stunum;

    private Integer majorid;

    private String classcode;

    private Integer classstatus;

    private Date classbegintime;

    private Date classendtime;

    private String classdesc;

    public Integer getClazzid() {
        return clazzid;
    }

    public void setClazzid(Integer clazzid) {
        this.clazzid = clazzid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Employee getEmployeeA() {
        return employeeA;
    }

    public void setEmployeeA(Employee employeeA) {
        this.employeeA = employeeA;
    }

    public Employee getEmployeeB() {
        return employeeB;
    }

    public void setEmployeeB(Employee employeeB) {
        this.employeeB = employeeB;
    }

    public Integer getStunum() {
        return stunum;
    }

    public void setStunum(Integer stunum) {
        this.stunum = stunum;
    }

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    public String getClasscode() {
        return classcode;
    }

    public void setClasscode(String classcode) {
        this.classcode = classcode == null ? null : classcode.trim();
    }

    public Integer getClassstatus() {
        return classstatus;
    }

    public void setClassstatus(Integer classstatus) {
        this.classstatus = classstatus;
    }

    public Date getClassbegintime() {
        return classbegintime;
    }

    public void setClassbegintime(Date classbegintime) {
        this.classbegintime = classbegintime;
    }

    public Date getClassendtime() {
        return classendtime;
    }

    public void setClassendtime(Date classendtime) {
        this.classendtime = classendtime;
    }

    public String getClassdesc() {
        return classdesc;
    }

    public void setClassdesc(String classdesc) {
        this.classdesc = classdesc == null ? null : classdesc.trim();
    }
}