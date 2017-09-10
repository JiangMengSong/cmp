package com.hfxt.cmp.controller.employee;

import com.hfxt.cmp.model.Employee;
import com.hfxt.cmp.service.employee.EmployeeService;
import common.utils.CookieUtil;
import common.utils.Validity;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    /**
     * 跳转登录页面
     * */
    @RequestMapping(value = "/login/toLogin.html",produces = "text/html;charset=utf-8")
    public String toLogin(HttpServletRequest request){
        if (null != request.getSession().getAttribute("emp")) return "index";
        Cookie ckEmpName = CookieUtil.getCookieByName(request,"empName"); // 获取登录名Cookie信息
        Cookie ckEmpPwd = CookieUtil.getCookieByName(request,"empPwd"); // 获取登录密码Cookie信息
        // 判断是否为空
        if (!Validity.isEmpty(ckEmpName) && !Validity.isEmpty(ckEmpPwd) && !Validity.isEmpty(ckEmpName.getValue())){
            Employee employee = employeeService.getEmployeeByName(ckEmpName.getValue()); // 根据登录名获取用户对象
            // 判断用户名和密码是否正确
            if (!Validity.isEmpty(employee) && employee.getLoginpwd().equals(ckEmpPwd.getValue())){
                request.getSession().setAttribute("emp",employee); // 存放如session
                return "index"; // 直接跳转首页
            }
        }
        return "employee/login"; // 跳转登录页面
    }

    /**
     * 登录
     * */
    @RequestMapping(value = "/login/doLogin.html",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String doLogin(HttpServletResponse response, HttpSession session, Employee loginEmp , @RequestParam(value = "loginCheck",required = false) String loginCheck){
        JSONObject result = new JSONObject(); // 返回JSON格式数据
        result.put("flag",false); // 默认登录失败
        // 验证用户名与密码是否为空
        if (Validity.isEmpty(loginEmp) || Validity.isEmpty(loginEmp.getLoginname()) || Validity.isEmpty(loginEmp.getLoginpwd())){
            result.put("resMsg","用户名和密码不允许为空");
            return result.toString();
        }
        Employee employee = employeeService.getEmployeeByName(loginEmp.getLoginname()); // 根据用户名获取对象
        // 判断用户名或密码是否正确
        if (Validity.isEmpty(employee) || !employee.getLoginpwd().equals(loginEmp.getLoginpwd())){
            result.put("resMsg","用户名或密码不正确"); // 返回错误信息
            return result.toString();
        }
        session.setAttribute("emp",employee); // 将用户存放入session中
        CookieUtil.addCookie(response,"empName",null,0); // 移除Cookie登录名信息
        CookieUtil.addCookie(response,"empPwd",null,0); // 移除Cookie登录密码信息
        // 判断用户是否选择三天内不再重复登录
        if (!Validity.isEmpty(loginCheck) && loginCheck.equals("1")){
            CookieUtil.addCookie(response,"empName",employee.getLoginname(),120); // 增加Cookie登录名信息259200
            CookieUtil.addCookie(response,"empPwd",employee.getLoginpwd(),120); // 增加Cookie登录密码信息
        }
        result.put("flag",true); // 设置登录成功
        return result.toString();
    }

    /**
     * 注销用户
     * */
    @RequestMapping(value = "/login/retLogin.html",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String retLogin(HttpServletResponse response,HttpSession session){
        session.removeAttribute("emp"); // 移除当前用户信息
        CookieUtil.addCookie(response,"empName",null,0); // 移除Cookie登录名信息
        CookieUtil.addCookie(response,"empPwd",null,0); // 移除Cookie登录密码信息
        return new JSONObject().put("flag",true).toString();
    }

    /**
     * 跳转首页
     * */
    @RequestMapping(value = "/toIndex.html",produces = "text/html;charset=utf-8")
    public String toIndex(HttpServletRequest request){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        return "index"; // 跳转首页
    }

    /**
     * hello页面
     * */
    @RequestMapping(value = "/toHello.html",produces = "text/html;charset=utf-8")
    public String toHello(HttpServletRequest request){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        return "hello"; // 返回hello页面
    }

    /**
     * 员工列表
     * */
    @RequestMapping(value = "/empList.html",produces = "text/html;charset=utf-8")
    public String empList(HttpServletRequest request){
        if (null == request.getSession().getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        request.setAttribute("empList",employeeService.getEmployee());
        return "employee/emp_list";
    }

    /**
     * 根据Id删除员工
     */
    @RequestMapping(value = "/delEmp/{empId}",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delEmp(HttpSession session, @PathVariable Integer empId){
        if (null == session.getAttribute("emp")) return "redirect:/employee/login/toLogin.html";
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (null == empId || empId < 1) return result.toString();
        if (employeeService.delEmployee(empId) > 0) result.put("flag",true);
        return result.toString();
    }
}
