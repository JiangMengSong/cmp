package com.hfxt.cmp.controller.subject;

import com.hfxt.cmp.controller.BaseController;
import com.hfxt.cmp.model.Major;
import com.hfxt.cmp.model.Subject;
import com.hfxt.cmp.service.subject.SubjectService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by JQY on 2017/9/12.
 */
@Controller
@RequestMapping("/subject")
@Scope("prototype")
public class SubjectController extends BaseController {
    @Autowired
    SubjectService subjectservice;

    public SubjectController(HttpSession session) {
        super(session);
    }

    @RequestMapping(value = "/subjectList.html",produces = "text/html;charset=utf-8")
    public String subList(HttpServletRequest request){
        if (getPower().isLogin()) return toLogin;
        if (!getPower().isSel()) return toNotPowerJsp;
        request.setAttribute("subjectList",subjectservice.getAll());
        return "subject/subject_list";
    }

    //跳转修改专业信息
    @RequestMapping(value="/toupdatesubject/{subid}",produces ="text/html;charset=utf-8")
    public String tomajor(HttpServletRequest request,@PathVariable Integer subid){
        if (getPower().isLogin()) return toLogin;
        if (!getPower().isOpera()) return toNotPowerJsp;
        if (subid != null && subid > 0) request.setAttribute("subject",subjectservice.selectbyid(subid));
       // request.setAttribute("upsub",subjectservice.getAll());
        return "subject/subject_edit";
    }

    //修改专业信息
    @RequestMapping(value="/updatesubject.html",produces ="text/html;charset=utf-8")
    @ResponseBody
    public String upmajor(HttpServletRequest request, Subject subject){
        if (getPower().isLogin()) return toLogin;
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (!getPower().isOpera()){
            result.put("msg","对不起，您没有权限执行该操作");
            return result.toString();
        }
        if (subject == null) return result.toString();
        if (subject.getSubid()!=null && subject.getSubid() > 0 && subjectservice.updatesub(subject) > 0) result.put("flag",true);
        else if (subjectservice.addsub(subject) > 0) result.put("flag",true);
        else result.put("msg","编辑失败,请提交正确的信息");

        return result.toString();
    }
    @RequestMapping(value = "/subList.html", produces = "text/html;charset=UTF-8")
    public String subshow(Model model,Subject subject){
        if (getPower().isLogin()) return toLogin;
        if (!getPower().isSel()) return toNotPowerJsp;
        try{
            List<Subject> sublist=subjectservice.getlist(subject);
            model.addAttribute("subjectList",sublist);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "subject/subject_list";
    }
}
