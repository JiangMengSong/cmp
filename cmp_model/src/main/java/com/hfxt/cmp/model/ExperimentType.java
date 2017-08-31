package com.hfxt.cmp.model;

public class ExperimentType {
    private Integer typid;

    private String typename;

    private String typedesc;

    public Integer getTypid() {
        return typid;
    }

    public void setTypid(Integer typid) {
        this.typid = typid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getTypedesc() {
        return typedesc;
    }

    public void setTypedesc(String typedesc) {
        this.typedesc = typedesc == null ? null : typedesc.trim();
    }
}