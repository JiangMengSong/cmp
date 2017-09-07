package com.hfxt.cmp.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Interview {
    private Integer inteid;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date intetime;

    private Student student;

    private String intedesc;

    private Employee employee;

    public Integer getInteid() {
        return inteid;
    }

    public void setInteid(Integer inteid) {
        this.inteid = inteid;
    }

    public Date getIntetime() {
        return intetime;
    }

    public void setIntetime(Date intetime) {
        this.intetime = intetime;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getIntedesc() {
        return intedesc;
    }

    public void setIntedesc(String intedesc) {
        this.intedesc = intedesc == null ? null : intedesc.trim();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}