package com.hfxt.cmp.model;

public class Major {
    private Integer majorid;

    private String majorname;

    private String majordesc;

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    public String getMajordesc() {
        return majordesc;
    }

    public void setMajordesc(String majordesc) {
        this.majordesc = majordesc == null ? null : majordesc.trim();
    }
}