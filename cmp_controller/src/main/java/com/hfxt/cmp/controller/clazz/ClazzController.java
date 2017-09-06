package com.hfxt.cmp.controller.clazz;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hfxt.cmp.model.Clazz;
import com.hfxt.cmp.service.clazz.ClazzService;
import com.hfxt.cmp.service.major.MajorService;

@Controller
@RequestMapping("/clazz")
public class ClazzController {

	@Autowired
	ClazzService clazzService;
	
	@Autowired
	MajorService majorService;
	 //clazz首页
	@RequestMapping(value = "/clazzList.html", produces = "text/html;charset=UTF-8")
	public String index(Model model,Clazz clazz) {
		try {
			List<Clazz> clazzList=clazzService.getClazz(clazz);
			model.addAttribute("clazzList",clazzList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "clazz/clazz-list";
	}
	/**
     * 跳转编辑信息
     */
    @RequestMapping(value = "/toAddClazz/{clazzId}",produces = "text/html;charset=utf-8")
    public String toAddClazz(HttpServletRequest request, @PathVariable Integer clazzId){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        if (clazzId != null && clazzId > 0) request.setAttribute("clazz",clazzService.selectByPrimaryKey(clazzId));
        request.setAttribute("majorList", majorService.majorList());
        return "clazz/clazz-add"; // 返回hello页面
    }
    /**
     * 添加
     */
    @RequestMapping(value = "/addClazz",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String addClazz(Clazz clazz,HttpSession session){
        if (null == session.getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        JSONObject result = new JSONObject();
        int count=0;
        if(clazz.getClazzid()!=null&&clazz.getClazzid()>0){
        	count=clazzService.updateByPrimaryKeySelective(clazz);
        }else{
        	count=clazzService.insert(clazz);
        }
        if(count>0){
        	result.put("flag",true);
        }else{
        	result.put("flag",false);
        }
        return result.toString();
    }
    /**
     * 根据Id删除
     */
    @RequestMapping(value = "/delClazz/{clazzId}",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delClazz(HttpSession session, @PathVariable Integer clazzId){
        if (null == session.getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        JSONObject result = new JSONObject();
        result.put("data",false);
        if (null == clazzId || clazzId < 1) return result.toString();
        //if (studentService.delStudent(stuId) > 0) result.put("flag",true);
        return result.toString();
    }
    /*
     * 
     * 详细信息
     */
    @RequestMapping(value = "/clazzshow/{clazzId}",produces = "text/html;charset=utf-8")
    public String showClazz(HttpServletRequest request, @PathVariable Integer clazzId){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        request.setAttribute("clazz",clazzService.selectByPrimaryKey(clazzId));
        return "clazz/clazz-show"; // 返回hello页面
    }
}
