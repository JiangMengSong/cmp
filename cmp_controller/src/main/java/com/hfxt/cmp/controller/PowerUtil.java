package com.hfxt.cmp.controller;

import com.hfxt.cmp.controller.check.EmpCheckController;
import com.hfxt.cmp.controller.check.StuCheckController;
import com.hfxt.cmp.controller.clazz.ClazzController;
import com.hfxt.cmp.controller.employee.EmployeeController;
import com.hfxt.cmp.controller.interview.InterviewController;
import com.hfxt.cmp.controller.major.MajorController;
import com.hfxt.cmp.controller.student.StuExperimentController;
import com.hfxt.cmp.controller.student.StudentController;
import com.hfxt.cmp.controller.subject.SubjectController;
import com.hfxt.cmp.model.Employee;

public class PowerUtil {
    private Employee employee; // 员工
    private boolean isLogin = true; // 是否未登录
    private boolean isSel = true; // 查询权限
    private boolean isOpera = true; // 编辑权限
    private boolean isDel = true; // 删除权限

    public PowerUtil(Employee employee,BaseController baseController) {
        this.employee = employee;
        if (null != this.employee){
            this.isLogin = false;
            switch (employee.getEmprole()){
                case 2:
                    if (baseController instanceof MajorController || baseController instanceof SubjectController)
                        this.isDel = false;
                    break;
                case 3:
                case 4:
                    if (baseController instanceof EmpCheckController || baseController instanceof EmployeeController)
                        this.isSel = this.isOpera = this.isDel = false;
                    else if (baseController instanceof ClazzController)
                        this.isDel = this.isOpera = false;
                    else if (baseController instanceof StudentController)
                        this.isDel = false;
                    break;
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

    public boolean isOpera() {
        return isOpera;
    }

    public boolean isDel() {
        return isDel;
    }
}
