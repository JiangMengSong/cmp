package com.hfxt.cmp.controller.student;

import com.hfxt.cmp.service.studnet.StudentService;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource(name = "studentService")
    private StudentService studentService;

    /**
     * 学生列表
     * */
    @RequestMapping(value = "/stuList.html",produces = "text/html;charset=utf-8")
    public String stuList(HttpServletRequest request){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        request.setAttribute("stuList",studentService.getStudent());
        return "student/stu_list"; // 返回hello页面
    }

    /**
     * 根据Id删除学生
     */
    @RequestMapping(value = "/delStu/{stuId}",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delStu(HttpSession session, @PathVariable Integer stuId){
        if (null == session.getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (null == stuId || stuId < 1) return result.toString();
        //if (studentService.delStudent(stuId) > 0) result.put("flag",true);
        return result.toString();
    }

    /**
     * 跳转编辑学生信息
     */
    @RequestMapping(value = "/toEditStu/{stuId}",produces = "text/html;charset=utf-8")
    public String toEditExp(HttpServletRequest request, @PathVariable Integer stuId){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        if (stuId != null && stuId > 0) request.setAttribute("stu",studentService.getStudentById(stuId));
        return "student/stu_edit"; // 返回hello页面
    }
}
