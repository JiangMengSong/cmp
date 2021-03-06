package com.hfxt.cmp.controller.student;

import com.hfxt.cmp.controller.BaseController;
import com.hfxt.cmp.model.Student;
import com.hfxt.cmp.search.Search;
import com.hfxt.cmp.service.clazz.ClazzService;
import com.hfxt.cmp.service.studnet.StudentService;
import common.utils.Validity;
import org.json.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller
@RequestMapping("/student")
@Scope("prototype")
public class StudentController extends BaseController {
    @Resource(name = "studentService")
    private StudentService studentService;
    @Resource(name = "clazzService")
    private ClazzService clazzService;

    public StudentController(HttpSession session) {
        super(session);
    }

    /**
     * 学生列表
     * */
    @RequestMapping(value = "/stuList.html",produces = "text/html;charset=utf-8")
    public String stuList(HttpServletRequest request, Search search){
        if (getPower().isLogin()) return toLogin;
        if (!getPower().isSel()) return toNotPowerJsp;
        request.setAttribute("stuList",studentService.getStudent(search,getPower().getEmployee()));
        return "student/stu_list"; // 返回hello页面
    }

    /**
     * 根据Id删除学生
     */
    @RequestMapping(value = "/delStu/{stuId}",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delStu(HttpSession session, @PathVariable Integer stuId){
        if (getPower().isLogin()) return toLogin;
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (!getPower().isDel()){
            result.put("msg","对不起，您没有权限执行该操作");
            return result.toString();
        }
        if (null == stuId || stuId < 1) return result.toString();
        if (studentService.delStudent(stuId) > 0) result.put("flag",true);
        return result.toString();
    }

    /**
     * 根据Id批量删除学生
     */
    @RequestMapping(value = "/delStudent",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delStudent(HttpSession session, @RequestParam("stuId[]") Integer[] stuId){
        if (getPower().isLogin()) return toLogin;
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (!getPower().isDel()){
            result.put("msg","对不起，您没有权限执行该操作");
            return result.toString();
        }
        if(stuId == null || stuId.length == 0) return result.toString();
        for (Integer stuid: stuId) {
            if (null == stuid || stuid < 1) {
                result.put("flag",false);
                result.put("msg","id不允许为空");
            }
            else if (studentService.delStudent(stuid) > 0) result.put("flag",true);
            else {
                result.put("flag",false);
                result.put("msg","id"+stuid+"删除出现错误,请查询该记录是否存在或直接联系管理员");
                return result.toString();
            }
        }
        return result.toString();
    }

    /**
     * 跳转根据ID获取学生信息
     */
    @RequestMapping(value = "/toEditStu/{stuId}",produces = "text/html;charset=utf-8")
    public String toEditExp(HttpServletRequest request, @PathVariable Integer stuId,@RequestParam(value = "sel",required = false)Integer sel){
        if (getPower().isLogin()) return toLogin;
        if (!getPower().isSel()) return toNotPowerJsp;
        if (stuId != null && stuId > 0) request.setAttribute("stu",studentService.getStuById(stuId));
        if (sel != null) return "student/stu_detail";
        request.setAttribute("clazzList",clazzService.getClazz(null,this.getPower().getEmployee()));
        return "student/stu_edit";
    }

    /**
     * 编辑学生信息
     */
    @RequestMapping(value = "/editStu.html",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String editStu(HttpSession session,Student stu){
        if (getPower().isLogin()) return toLogin;
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (!getPower().isOpera()){
            result.put("msg","对不起，您没有权限执行该操作");
            return result.toString();
        }
        if (stu == null) return result.toString();
        if (Validity.isEmpty(stu.getStucode())) stu.setStucode(getStuCode());
        if (Validity.isEmpty(stu.getStuhead())) stu.setStuhead("default.jpg");
        if (stu.getStuid()!=null && stu.getStuid() > 0 && studentService.updateStudent(stu) > 0) result.put("flag",true);
        else if (studentService.addStudent(stu) > 0) result.put("flag",true);
        else result.put("msg","编辑失败,请提交正确的信息");
        return result.toString();
    }

    /**
     * 随机产生编号
     */
    public String getStuCode(){
        do{
            String stuCode = "#0" + new Random().nextInt(999999999);
            if (studentService.getStuCodeIsEmpty(stuCode) == 0) return stuCode;
        }while (true);
    }
}
