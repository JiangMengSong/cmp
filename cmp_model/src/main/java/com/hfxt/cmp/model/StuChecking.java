package com.hfxt.cmp.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class StuChecking {
    private Integer stucheckingid;

    private Student student;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date chetime;

    private Integer chestatus;

    private String stucheckingdesc;

    public Integer getStucheckingid() {
        return stucheckingid;
    }

    public void setStucheckingid(Integer stucheckingid) {
        this.stucheckingid = stucheckingid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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

    public String getStucheckingdesc() {
        return stucheckingdesc;
    }

    public void setStucheckingdesc(String stucheckingdesc) {
        this.stucheckingdesc = stucheckingdesc == null ? null : stucheckingdesc.trim();
    }
}