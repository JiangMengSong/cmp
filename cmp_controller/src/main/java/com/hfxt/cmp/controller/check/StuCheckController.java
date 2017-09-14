package com.hfxt.cmp.controller.check;

import com.hfxt.cmp.model.EmpChecking;
import com.hfxt.cmp.model.StuChecking;
import com.hfxt.cmp.model.Student;
import com.hfxt.cmp.search.Search;
import com.hfxt.cmp.service.check.EmpCheckService;
import com.hfxt.cmp.service.check.StuCheckService;
import com.hfxt.cmp.service.studnet.StudentService;
import common.utils.Validity;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/stucheck")
public class StuCheckController {

    @Resource(name = "stuCheckService")
   private StuCheckService stuCheckService;

    @Resource(name = "studentService")
    private StudentService studentService;


    //查询
    @RequestMapping(value = "/getStuCheck.html", produces = "text/html;charset=utf-8")
    public String getStuCheck(HttpServletRequest request, Search stuCheck) {
        List<StuChecking> checkList=stuCheckService.getStuCheck(stuCheck);
        if(checkList!=null){
            request.setAttribute("checkList",checkList);
        }
        return "check/stuchecklist";

    }

    //删除
    @RequestMapping(value = "/delStuCheck/{stucheckingid}",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delStuCheck(HttpServletRequest request,@PathVariable Integer stucheckingid){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (null == stucheckingid ) return result.toString();
        if (stuCheckService.delete(stucheckingid)>0) result.put("flag",true);
        return result.toString();
    }

    /**
     * 跳转编辑学生信息
     */
    @RequestMapping(value = "/toGet/{stucheckingid}",produces = "text/html;charset=utf-8")
    public String toEditStu(HttpServletRequest request, @PathVariable Integer stucheckingid){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        if (stucheckingid != null && stucheckingid > 0) request.setAttribute("stu",stuCheckService.getCheckById(stucheckingid));
        request.setAttribute("studentList",studentService.getStudent(null));
        return "check/stucheck_edit";
    }

    /**
     * 编辑学生信息
     */
    @RequestMapping(value = "/upStuCheck.html",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String editStu(HttpSession session,StuChecking stucheck){
        if (null == session.getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (stucheck == null) return result.toString();
        if (stucheck.getStucheckingid()!=null && stucheck.getStucheckingid() > 0 && stuCheckService.update(stucheck) > 0) result.put("flag",true);
        else if (stuCheckService.insert(stucheck) > 0) result.put("flag",true);
        else result.put("msg","编辑失败,请提交正确的信息");
        return result.toString();
    }

    /**
     * 根据Id批量删除学生
     */
    @RequestMapping(value = "/delStuCheckAll",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delEmpCheck(HttpSession session, @RequestParam("stucheckId[]") Integer[] stucheckId){
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if(stucheckId == null || stucheckId.length == 0) return result.toString();
        for (Integer empcheckid: stucheckId) {
            if (null == empcheckid || empcheckid < 1) {
                result.put("flag",false);
                result.put("msg","id不允许为空");
            }
            else if (stuCheckService.delete(empcheckid)> 0) result.put("flag",true);
            else {
                result.put("flag",false);
                result.put("msg","id"+empcheckid+"删除出现错误,请查询该记录是否存在或直接联系管理员");
            }
        }
        return result.toString();
    }
}
