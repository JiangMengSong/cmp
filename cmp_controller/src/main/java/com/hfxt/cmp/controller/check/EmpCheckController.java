package com.hfxt.cmp.controller.check;

import com.hfxt.cmp.controller.BaseController;
import com.hfxt.cmp.model.EmpChecking;
import com.hfxt.cmp.model.StuChecking;
import com.hfxt.cmp.search.Search;
import com.hfxt.cmp.service.check.EmpCheckService;
import com.hfxt.cmp.service.check.StuCheckService;
import com.hfxt.cmp.service.employee.EmployeeService;
import com.hfxt.cmp.service.studnet.StudentService;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@Scope("prototype")
public class EmpCheckController extends BaseController {
    @Resource(name = "empCheckService")
    private   EmpCheckService empCheckService;

    @Resource(name = "employeeService")
   private EmployeeService employeeService;

    public EmpCheckController(HttpSession session) {
        super(session);
    }


    //查询
    @RequestMapping(value = "/getEmpCheck.html", produces = "text/html;charset=utf-8")
    public String getEmpCheck(HttpServletRequest request, Search empCheck) {
        if (getPower().isLogin()) return toLogin;
        List<EmpChecking> checkList=empCheckService.getEmpCheck(empCheck);
            request.setAttribute("checkList", checkList);

        return "check/empchecklist";

    }
    //删除
    @RequestMapping(value = "/delEmpCheck/{empcheckingid}",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delEmpCheck(HttpSession session, @PathVariable Integer empcheckingid){
        if (getPower().isLogin()) return toLogin;
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
        if (getPower().isLogin()) return toLogin;
        if (empcheckingid != null && empcheckingid > 0) request.setAttribute("empedit",empCheckService.getCheckById(empcheckingid));
        request.setAttribute("employee",employeeService.getEmployee());
        return "check/empcheck_edit";
    }

    /**
     * 编辑教员信息
     */
    @RequestMapping(value = "/upEmpCheck.html",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String editStu(HttpSession session,EmpChecking empchecking){
        if (getPower().isLogin()) return toLogin;
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (empchecking== null) return result.toString();
        if (empchecking.getEmpcheckingid()!=null && empchecking.getEmpcheckingid() > 0 && empCheckService.update(empchecking) > 0) result.put("flag",true);
        else if (empCheckService.insert(empchecking) > 0) result.put("flag",true);
        else result.put("msg","编辑失败,请提交正确的信息");
        return result.toString();
    }

    /**
     批量删除
     */
    @RequestMapping(value = "/delEmpCheckAll",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delEmpCheck(HttpSession session, @RequestParam("empcheckId[]") Integer[] empcheckId){
        if (getPower().isLogin()) return toLogin;
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if(empcheckId == null || empcheckId.length == 0) return result.toString();
        for (Integer empcheckid: empcheckId) {
            if (null == empcheckid || empcheckid < 1) {
                result.put("flag",false);
                result.put("msg","id不允许为空");
            }
            else if (empCheckService.delete(empcheckid)> 0) result.put("flag",true);
            else {
                result.put("flag",false);
                result.put("msg","id"+empcheckid+"删除出现错误,请查询该记录是否存在或直接联系管理员");
            }
        }
        return result.toString();
    }


}
