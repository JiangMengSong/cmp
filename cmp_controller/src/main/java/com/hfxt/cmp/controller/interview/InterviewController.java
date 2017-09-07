package com.hfxt.cmp.controller.interview;

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
import com.hfxt.cmp.model.Interview;
import com.hfxt.cmp.service.clazz.ClazzService;
import com.hfxt.cmp.service.employee.EmployeeService;
import com.hfxt.cmp.service.interview.InterviewService;
import com.hfxt.cmp.service.major.MajorService;
import com.hfxt.cmp.service.studnet.StudentService;

@Controller
@RequestMapping("/interview")
public class InterviewController {

	@Autowired
	InterviewService interviewService;
	@Autowired
	StudentService studentService;
	@Autowired
	EmployeeService employeeService;
	
	 //clazz首页
	@RequestMapping(value = "/interviewList.html", produces = "text/html;charset=UTF-8")
	public String index(Model model,Interview interview) {
		try {
			List<Interview> interviewList=interviewService.getInterview(interview);
			model.addAttribute("interviewList",interviewList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "interview/interview-list";
	}
	/**
     * 跳转编辑信息
     */
    @RequestMapping(value = "/toAddInterview/{inteid}",produces = "text/html;charset=utf-8")
    public String toAddInterview(HttpServletRequest request, @PathVariable Integer inteid){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        if (inteid != null && inteid > 0) request.setAttribute("interview",interviewService.selectByPrimaryKey(inteid));
        request.setAttribute("studentList",studentService.getStudent());
        request.setAttribute("employeeList",employeeService.getEmployee());
        return "interview/interview-add"; // 返回hello页面
    }
    /**
     * 添加
     */
    @RequestMapping(value = "/addInterview",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String addInterview(Interview interview,HttpSession session){
        if (null == session.getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        JSONObject result = new JSONObject();
        int count=0;
        if(interview.getInteid()!=null&&interview.getInteid()>0){
        	count=interviewService.updateByPrimaryKeySelective(interview);
        }else{
        	count=interviewService.insertSelective(interview);
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
    @RequestMapping(value = "/delInterview/{inteid}",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delInterview(HttpSession session, @PathVariable Integer inteid){
        if (null == session.getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        JSONObject result = new JSONObject();
        int count=interviewService.deleteByPrimaryKey(inteid);
        if(count>0){
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
    @RequestMapping(value = "/interviewshow/{inteid}",produces = "text/html;charset=utf-8")
    public String showClazz(HttpServletRequest request, @PathVariable Integer inteid){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        request.setAttribute("interview",interviewService.selectByPrimaryKey(inteid));
        return "interview/interview-show"; // 返回hello页面
    }
}
