package com.hfxt.cmp.controller.check;

import com.hfxt.cmp.model.EmpChecking;
import com.hfxt.cmp.model.StuChecking;
import com.hfxt.cmp.service.check.EmpCheckService;
import com.hfxt.cmp.service.check.StuCheckService;
import com.hfxt.cmp.service.employee.EmployeeService;
import com.hfxt.cmp.service.studnet.StudentService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/9/2 0002.
 */
@Controller
@RequestMapping("/empcheck")
public class EmpCheckController {
    @Resource(name = "empCheckService")
    private   EmpCheckService empCheckService;

    @Resource(name = "employeeService")
   private EmployeeService employeeService;




    //查询
    @RequestMapping(value = "/getEmpCheck.html", produces = "text/html;charset=utf-8")
    public String getEmpCheck(HttpServletRequest request,EmpChecking empCheck) {
        List<EmpChecking> checkList=empCheckService.getEmpCheck(empCheck);

        if(checkList!=null){
            request.setAttribute("checkList",checkList);
        }
        return "check/empchecklist";

    }
    //删除
    @RequestMapping(value = "/delEmpCheck/{empcheckingid}",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delEmpCheck(HttpSession session, @PathVariable Integer empcheckingid){
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (null == empcheckingid ) return result.toString();
        if (empCheckService.delete(empcheckingid)>0) result.put("flag",true);
        return result.toString();
    }

    /**
     * 跳转编辑学生信息
     */
    @RequestMapping(value = "/toGet/{empcheckingid}",produces = "text/html;charset=utf-8")
    public String toEditExp(HttpServletRequest request, @PathVariable Integer empcheckingid){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        if (empcheckingid != null && empcheckingid > 0) request.setAttribute("stu",empCheckService.getCheckById(empcheckingid));
        request.setAttribute("emp",employeeService.getEmployee());
        return "check/stucheck_edit";
    }

    /**
     * 编辑学生信息
     */
    @RequestMapping(value = "/upEmpCheck.html",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String editStu(HttpSession session,EmpChecking empcheck){
        if (null == session.getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (empcheck == null) return result.toString();
        if (empcheck.getEmpcheckingid()!=null && empcheck.getEmpcheckingid() > 0 && empCheckService.update(empcheck) > 0) result.put("flag",true);
        else if (empCheckService.insert(empcheck) > 0) result.put("flag",true);
        else result.put("msg","编辑失败,请提交正确的信息");
        return result.toString();
    }


}
