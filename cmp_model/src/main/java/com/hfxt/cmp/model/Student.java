package com.hfxt.cmp.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Student {
    private Integer stuid;

    private String stuname;

    private Integer stusex;

    private Clazz clazz;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date stubirth;

    private String stuphone;

    private String stucode;

    private String stuaddress;

    private String stucontact;

    private String studesc;

    private String stuqq;

    private String stuemail;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date stuentrytime;

    private String studegree;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public Integer getStusex() {
        return stusex;
    }

    public void setStusex(Integer stusex) {
        this.stusex = stusex;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Date getStubirth() {
        return stubirth;
    }

    public void setStubirth(Date stubirth) {
        this.stubirth = stubirth;
    }

    public String getStuphone() {
        return stuphone;
    }

    public void setStuphone(String stuphone) {
        this.stuphone = stuphone == null ? null : stuphone.trim();
    }

    public String getStucode() {
        return stucode;
    }

    public void setStucode(String stucode) {
        this.stucode = stucode == null ? null : stucode.trim();
    }

    public String getStuaddress() {
        return stuaddress;
    }

    public void setStuaddress(String stuaddress) {
        this.stuaddress = stuaddress == null ? null : stuaddress.trim();
    }

    public String getStucontact() {
        return stucontact;
    }

    public void setStucontact(String stucontact) {
        this.stucontact = stucontact == null ? null : stucontact.trim();
    }

    public String getStudesc() {
        return studesc;
    }

    public void setStudesc(String studesc) {
        this.studesc = studesc == null ? null : studesc.trim();
    }

    public String getStuqq() {
        return stuqq;
    }

    public void setStuqq(String stuqq) {
        this.stuqq = stuqq == null ? null : stuqq.trim();
    }

    public String getStuemail() {
        return stuemail;
    }

    public void setStuemail(String stuemail) {
        this.stuemail = stuemail == null ? null : stuemail.trim();
    }

    public Date getStuentrytime() {
        return stuentrytime;
    }

    public void setStuentrytime(Date stuentrytime) {
        this.stuentrytime = stuentrytime;
    }

    public String getStudegree() {
        return studegree;
    }

    public void setStudegree(String studegree) {
        this.studegree = studegree == null ? null : studegree.trim();
    }
}