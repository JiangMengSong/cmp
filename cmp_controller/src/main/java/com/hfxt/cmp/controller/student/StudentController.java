package com.hfxt.cmp.controller.student;

import com.hfxt.cmp.service.studnet.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
}
