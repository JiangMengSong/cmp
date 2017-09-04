package com.hfxt.cmp.controller.student;

import com.hfxt.cmp.service.studnet.StuExperimentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/student")
public class StuExperimentController {
    @Resource(name = "stuExperimentService")
    StuExperimentService stuExperimentService;

    @RequestMapping(value = "/expList.html",produces = "text/html;charset=utf-8")
    public String expList(HttpServletRequest request){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        request.setAttribute("expList",stuExperimentService.getStuExperiment());
        return "student/stu_experiment_list"; // 返回hello页面
    }
}
