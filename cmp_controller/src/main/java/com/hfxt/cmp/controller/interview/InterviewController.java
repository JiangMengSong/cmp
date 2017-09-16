package com.hfxt.cmp.controller.interview;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.hfxt.cmp.controller.BaseController;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@Scope("prototype")
public class InterviewController extends BaseController {

	@Autowired
	InterviewService interviewService;
	@Autowired
	StudentService studentService;
	@Autowired
	EmployeeService employeeService;

    public InterviewController(HttpSession session) {
        super(session);
    }

    //clazz首页
	@RequestMapping(value = "/interviewList.html", produces = "text/html;charset=UTF-8")
	public String index(Model model,Interview interview) {
        if (getPower().isLogin()) return toLogin;
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
        if (getPower().isLogin()) return toLogin;
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        if (inteid != null && inteid > 0) request.setAttribute("interview",interviewService.selectByPrimaryKey(inteid));
        request.setAttribute("studentList",studentService.getStudent(null,getPower().getEmployee().getEmpid()));
        request.setAttribute("employeeList",employeeService.getEmployee());
        return "interview/interview-add"; // 返回hello页面
    }
    /**
     * 添加
     */
    @RequestMapping(value = "/addInterview",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String addInterview(Interview interview,HttpSession session){
        if (getPower().isLogin()) return toLogin;
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
        if (getPower().isLogin()) return toLogin;
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
        if (getPower().isLogin()) return toLogin;
        request.setAttribute("interview",interviewService.selectByPrimaryKey(inteid));
        return "interview/interview-show"; // 返回hello页面
    }

    /**
     * 根据Id批量删除学生
     */
    @RequestMapping(value = "/delInterview1",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String del_Interview(HttpSession session, @RequestParam("inteid[]") Integer[] inteid){
        if (getPower().isLogin()) return toLogin;
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if(inteid == null || inteid.length == 0) return result.toString();
        for (Integer inteid1: inteid) {
            if (null == inteid1 || inteid1 < 1) {
                result.put("flag",false);
                result.put("msg","id不允许为空");
            }
            else if (interviewService.deleteByPrimaryKey(inteid1) > 0) result.put("flag",true);
            else {
                result.put("flag",false);
                result.put("msg","id"+inteid1+"删除出现错误,请查询该记录是否存在或直接联系管理员");
                return result.toString();
            }
        }
        return result.toString();
    }
}
