package com.hfxt.cmp.controller.employee;

import com.hfxt.cmp.controller.BaseController;
import com.hfxt.cmp.model.Employee;
import com.hfxt.cmp.service.employee.EmployeeService;
import common.utils.CookieUtil;
import common.utils.Validity;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
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
@Scope("prototype")
public class EmployeeController extends BaseController {
    @Autowired
    EmployeeService employeeService;

    public EmployeeController(HttpSession session) {
        super(session);
    }

    /**
     * 跳转登录
     * */
    @RequestMapping(value = "/login/toLogin.html",produces = "text/html;charset=utf-8")
    public String toLogin(HttpServletRequest request){
        if (null != employee) return "index";
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
        if (Validity.isEmpty(employee) || !employee.getLoginpwd().equals(loginEmp.getLoginpwd()))
            return result.put("resMsg","用户名或密码不正确").toString();// 返回错误信息

        if (employee.getEmprole() == null || employee.getEmprole() == 0)
            return result.put("resMsg","对不起,你已经离职").toString();// 返回错误信息
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
        if (null != employee) employee = null;
        return new JSONObject().put("flag",true).toString();
    }

    /**
     * 跳转首页
     * */
    @RequestMapping(value = "/toIndex.html",produces = "text/html;charset=utf-8")
    public String toIndex(HttpServletRequest request){
        if (null == employee) return toLogin;
        return "index"; // 跳转首页
    }

    /**
     * hello页面
     * */
    @RequestMapping(value = "/toHello.html",produces = "text/html;charset=utf-8")
    public String toHello(HttpServletRequest request){
        if (null == employee) return toLogin;
        return "hello"; // 返回hello页面
    }

    /**
     * 员工列表
     * */
    @RequestMapping(value = "/empList.html",produces = "text/html;charset=utf-8")
    public String empList(HttpServletRequest request){
        if (null == employee) return toLogin;
        request.setAttribute("empList",employeeService.getEmployee());
        return "employee/emp_list";
    }

    /**
     * 根据Id获取指定员工信息
     */
    @RequestMapping(value = "/empEdit/{empId}",produces = "text/html;charset=utf-8")
    public String getEmpById(HttpServletRequest request,@PathVariable Integer empId,@RequestParam(value = "sel",required = false)Integer sel){
        if (null == employee) return toLogin;
        if (empId != null && empId > 0) request.setAttribute("employee",employeeService.getEmpById(empId));
        if (sel != null) return "employee/emp_detail";
        return "employee/emp_edit";
    }

    /**
     * 编辑员工信息
     */
    @RequestMapping(value = "/editEmp.html",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String editStu(HttpSession session,Employee emp){
        if (null == employee) return toLogin;
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (emp == null) return result.toString();
        if (Validity.isEmpty(emp.getEmphead())) emp.setEmphead("default.jpg");
        if (emp.getEmpid()!=null && emp.getEmpid() > 0 && employeeService.updateEmployee(emp) > 0) result.put("flag",true);
        else if (employeeService.addEmployee(emp) > 0) result.put("flag",true);
        else result.put("msg","编辑失败,请提交正确的信息");
        return result.toString();
    }

    /**
     * 根据Id删除员工
     */
    @RequestMapping(value = "/delEmp/{empId}",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delEmp( @PathVariable Integer empId){
        if (null == employee) return toLogin;
        JSONObject result = new JSONObject();
        result.put("flag",false);
        if (null == empId || empId < 1) return result.toString();
        if (employeeService.delEmployee(empId) > 0) result.put("flag",true);
        return result.toString();
    }
}
