package com.hfxt.cmp.model;

import java.util.Date;

public class Clazz {
    private Integer clazzid;

    private String classname;

    private Integer stunum;

    private Major major;

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

    public Integer getStunum() {
        return stunum;
    }

    public void setStunum(Integer stunum) {
        this.stunum = stunum;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
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