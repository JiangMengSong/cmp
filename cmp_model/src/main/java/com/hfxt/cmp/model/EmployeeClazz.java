package com.hfxt.cmp.model;

public class EmployeeClazz {
    private Integer empclazzid;

    private Employee employee;

    private Clazz clazz;

    public Integer getEmpclazzid() {
        return empclazzid;
    }

    public void setEmpclazzid(Integer empclazzid) {
        this.empclazzid = empclazzid;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }
}