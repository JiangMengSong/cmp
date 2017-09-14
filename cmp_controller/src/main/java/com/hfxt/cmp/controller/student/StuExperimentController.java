package com.hfxt.cmp.controller.student;

import com.hfxt.cmp.controller.BaseController;
import com.hfxt.cmp.service.studnet.StuExperimentService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/student")
@Scope("prototype")
public class StuExperimentController extends BaseController {
    @Resource(name = "stuExperimentService")
    StuExperimentService stuExperimentService;

    public StuExperimentController(HttpSession session) {
        super(session);
    }

    /**
     * 查看所有测验信息
     */
    @RequestMapping(value = "/expList.html",produces = "text/html;charset=utf-8")
    public String expList(HttpServletRequest request){
        if (null == employee) return toLogin;
        request.setAttribute("expList",stuExperimentService.getStuExperiment());
        return "student/experiment/stu_exp_list";
    }

    /**
     * 跳转编辑测验信息
     */
    @RequestMapping(value = "/toEditExp/{expId}",produces = "text/html;charset=utf-8")
    public String toEditExp(HttpServletRequest request, @PathVariable Integer expId){
        if (null == employee) return toLogin;

        return "student/";
    }


}
