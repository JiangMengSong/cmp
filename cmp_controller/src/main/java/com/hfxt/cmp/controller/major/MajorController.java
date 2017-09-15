package com.hfxt.cmp.controller.major;

import com.hfxt.cmp.controller.BaseController;
import com.hfxt.cmp.model.Major;
import com.hfxt.cmp.service.major.MajorService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by JQY on 2017/9/11.
 */
@Controller
@RequestMapping("/major")
@Scope("prototype")
public class MajorController extends BaseController {
    @Autowired
    MajorService majorservice;

    public MajorController(HttpSession session) {
        super(session);
    }

    @RequestMapping(value = "/majorList.html",produces = "text/html;charset=utf-8")
    public String empList(HttpServletRequest request){
        if (null == employee) return toLogin;
        request.setAttribute("majorList",majorservice.majorList());
        return "major/major_list";
    }
    //跳转修改专业信息
    @RequestMapping(value="/toupdatemajor/{majorid}",produces ="text/html;charset=utf-8")
    public String tomajor(HttpServletRequest request,@PathVariable Integer majorid){
        if (null == employee) return toLogin;
        if (majorid != null && majorid > 0) request.setAttribute("major",majorservice.selectbyid(majorid));
        //request.setAttribute("upmajor",majorservice.majorList());
        return "major/major_edit";
    }
    //修改专业信息
    @RequestMapping(value="/updatemajor.html",produces ="text/html;charset=utf-8")
    public String upmajor(HttpServletRequest request, Major major){
        if (null == employee) return toLogin;
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (major == null) return result.toString();
        if (major.getMajorid()!=null && major.getMajorid() > 0 && majorservice.updatemajor(major) > 0) result.put("flag",true);
        else if (majorservice.addmajor(major) > 0) result.put("flag",true);
        else result.put("msg","编辑失败,请提交正确的信息");
        return result.toString();
    }
}
