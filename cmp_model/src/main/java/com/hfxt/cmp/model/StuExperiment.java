package com.hfxt.cmp.model;

import java.util.Date;

public class StuExperiment {
    private Integer expid;

    private Subject subject;

    private Employee employee;

    private Student student;

    private String expcontent;

    private Date exptime;

    private Integer expscore;

    private String expdesc;

    private Integer exptype;

    public Integer getExpid() {
        return expid;
    }

    public void setExpid(Integer expid) {
        this.expid = expid;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getExpcontent() {
        return expcontent;
    }

    public void setExpcontent(String expcontent) {
        this.expcontent = expcontent == null ? null : expcontent.trim();
    }

    public Date getExptime() {
        return exptime;
    }

    public void setExptime(Date exptime) {
        this.exptime = exptime;
    }

    public Integer getExpscore() {
        return expscore;
    }

    public void setExpscore(Integer expscore) {
        this.expscore = expscore;
    }

    public String getExpdesc() {
        return expdesc;
    }

    public void setExpdesc(String expdesc) {
        this.expdesc = expdesc == null ? null : expdesc.trim();
    }

    public Integer getExptype() {
        return exptype;
    }

    public void setExptype(Integer exptype) {
        this.exptype = exptype;
    }
}