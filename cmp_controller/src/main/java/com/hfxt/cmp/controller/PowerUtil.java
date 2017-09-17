package com.hfxt.cmp.controller;

import com.hfxt.cmp.controller.clazz.ClazzController;
import com.hfxt.cmp.controller.employee.EmployeeController;
import com.hfxt.cmp.controller.student.StudentController;
import com.hfxt.cmp.model.Employee;

public class PowerUtil {
    private Employee employee; // 员工
    private boolean isLogin = true; // 是否未登录
    private boolean isSel = true; // 查询权限
    private boolean isAdd = true; // 添加权限
    private boolean isUpdate = true; // 修改权限
    private boolean isDel = true; // 删除权限

    public PowerUtil(Employee employee,BaseController baseController) {
        this.employee = employee;
        if (null == this.employee) this.isLogin = true;
        if (null != this.employee){
            if (baseController instanceof StudentController)
                if (employee.getEmprole() == 3 || employee.getEmprole() == 4) this.isDel = false;
            else if (baseController instanceof EmployeeController)
                if (employee.getEmprole() == 3 || employee.getEmprole() == 4) this.isSel = this.isAdd = this.isDel = this.isUpdate = false;
            else if (baseController instanceof ClazzController){
                if (employee.getEmprole() == 3 || employee.getEmprole() == 4) this.isDel = this.isAdd = false;
            }
        }
    }

    public Employee getEmployee() {
        return employee;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public boolean isSel() {
        return isSel;
    }

    public boolean isAdd() {
        return isAdd;
    }

    public boolean isUpdate() {
        return isUpdate;
    }

    public boolean isDel() {
        return isDel;
    }
}
