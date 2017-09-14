package com.hfxt.cmp.controller.major;

import com.hfxt.cmp.model.Major;
import com.hfxt.cmp.service.major.MajorService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by JQY on 2017/9/11.
 */
@Controller
@RequestMapping("/major")
public class MajorController {
    @Autowired
    MajorService majorservice;
    @RequestMapping(value = "/majorList.html",produces = "text/html;charset=utf-8")
    public String empList(HttpServletRequest request){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        request.setAttribute("majorList",majorservice.majorList());
        return "major/major_list";
    }
    //跳转修改专业信息
    @RequestMapping(value="/toupdatemajor/{majorid}",produces ="text/html;charset=utf-8")
    public String tomajor(HttpServletRequest request,@PathVariable Integer majorid){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        if (majorid != null && majorid > 0) request.setAttribute("major",majorservice.selectbyid(majorid));
        //request.setAttribute("upmajor",majorservice.majorList());
        return "major/major_edit";
    }
    //修改专业信息
    @RequestMapping(value="/updatemajor.html",produces ="text/html;charset=utf-8")
    public String upmajor(HttpServletRequest request, Major major){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (major == null) return result.toString();
        if (major.getMajorid()!=null && major.getMajorid() > 0 && majorservice.updatemajor(major) > 0) result.put("flag",true);
        else if (majorservice.addmajor(major) > 0) result.put("flag",true);
        else result.put("msg","编辑失败,请提交正确的信息");
        return result.toString();
    }
}
