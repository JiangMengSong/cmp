package com.hfxt.cmp.controller.clazz;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hfxt.cmp.controller.BaseController;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
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
@Scope("prototype")
public class ClazzController extends BaseController {
	@Autowired
	ClazzService clazzService;
	@Autowired
	MajorService majorService;

    public ClazzController(HttpSession session) {
        super(session);
    }

    /**
     * 查看所有班级信息
     * @param clazz
     * @return
     */
	@RequestMapping(value = "/clazzList.html", produces = "text/html;charset=UTF-8")
	public String clazzList(HttpServletRequest request, Clazz clazz) {
        if (null == employee) return toLogin;
        request.setAttribute("clazzList",clazzService.getClazz(clazz));
		return "clazz/clazz-list";
	}

	/**
     * 跳转编辑班级信息
     */
    @RequestMapping(value = "/toAddClazz/{clazzId}",produces = "text/html;charset=utf-8")
    public String toAddClazz(HttpServletRequest request, @PathVariable Integer clazzId){
        if (null == employee) return toLogin;
        if (clazzId != null && clazzId > 0) request.setAttribute("clazz",clazzService.selectByPrimaryKey(clazzId));
        request.setAttribute("majorList", majorService.majorList());
        return "clazz/clazz-add"; // 返回hello页面
    }
    /**
     * 编辑班级信息
     */
    @RequestMapping(value = "/addClazz",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String addClazz(Clazz clazz,HttpSession session){
        if (null == employee) return toLogin;
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if(clazz == null) return result.toString();
        if(clazz.getClazzid() != null && clazz.getClazzid() > 0 && clazzService.updateByPrimaryKeySelective(clazz) > 0 ) result.put("flag",true);
        else if(clazzService.insert(clazz) > 0) result.put("flag",true);
        return result.toString();
    }

    /**
     * 根据Id删除
     */
    @RequestMapping(value = "/delClazz/{clazzId}",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delClazz(HttpSession session, @PathVariable Integer clazzId){
        if (null == employee) return toLogin;
        JSONObject result = new JSONObject();
        if (null == clazzId || clazzId < 1){
            result.put("data",false);
        }else{
            result.put("data",true);
        }
        return result.toString();
    }
    /*
     *
     * 详细信息
     */
    @RequestMapping(value = "/clazzshow/{clazzId}",produces = "text/html;charset=utf-8")
    public String showClazz(HttpServletRequest request, @PathVariable Integer clazzId){
        if (null == employee) return toLogin;
        request.setAttribute("clazz",clazzService.selectByPrimaryKey(clazzId));
        return "clazz/clazz-show"; // 返回hello页面
    }
}
