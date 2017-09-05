package com.hfxt.cmp.controller.student;

import com.hfxt.cmp.service.studnet.StuExperimentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/student")
public class StuExperimentController {
    @Resource(name = "stuExperimentService")
    StuExperimentService stuExperimentService;

    /**
     * 查看所有测验信息
     */
    @RequestMapping(value = "/expList.html",produces = "text/html;charset=utf-8")
    public String expList(HttpServletRequest request){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        request.setAttribute("expList",stuExperimentService.getStuExperiment());
        return "student/stu_experiment_list"; // 返回hello页面
    }

    /**
     * 跳转编辑测验信息
     */
    @RequestMapping(value = "/toEditExp/{expId}",produces = "text/html;charset=utf-8")
    public String toEditExp(HttpServletRequest request, @PathVariable Integer expId){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        request.setAttribute("expList",stuExperimentService.getStuExperiment());
        return "student/"; // 返回hello页面
    }
}
