package com.hfxt.cmp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hfxt.cmp.service.IAdminUserService;
import com.hfxt.cmp.service.ICheckinginService;
import com.hfxt.cmp.service.IClazzService;
import com.hfxt.cmp.service.IClazzExperimentService;
import com.hfxt.cmp.service.IEmployeeService;
import com.hfxt.cmp.service.IEmployeeLoginService;
import com.hfxt.cmp.service.IInterviewService;
import com.hfxt.cmp.service.IMajorService;
import com.hfxt.cmp.service.INoticeService;
import com.hfxt.cmp.service.IProductService;
import com.hfxt.cmp.service.IRightService;
import com.hfxt.cmp.service.IRoleService;
import com.hfxt.cmp.service.IRoleRightService;
import com.hfxt.cmp.service.IStudentService;
import com.hfxt.cmp.service.IStudentCheckinginService;
import com.hfxt.cmp.service.IStudentExperimentService;
import com.hfxt.cmp.service.IStudentHomeworkService;
import com.hfxt.cmp.service.IStudentScoreService;
import com.hfxt.cmp.service.ISubjectService;
import com.hfxt.cmp.service.ITestService;
import com.hfxt.cmp.service.ITestTypeService;
/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime锛�2017-08-28
 */
public abstract class BaseController {

	protected final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    protected IAdminUserService adminUserService;
    @Autowired
    protected ICheckinginService checkinginService;
    @Autowired
    protected IClazzService clazzService;
    @Autowired
    protected IClazzExperimentService clazzExperimentService;
    @Autowired
    protected IEmployeeService employeeService;
    @Autowired
    protected IEmployeeLoginService employeeLoginService;
    @Autowired
    protected IInterviewService interviewService;
    @Autowired
    protected IMajorService majorService;
    @Autowired
    protected INoticeService noticeService;
    @Autowired
    protected IProductService productService;
    
    @Autowired
    protected IRightService rightService;
    
    @Autowired
    protected IRoleService roleService;
    @Autowired
    protected IRoleRightService roleRightService;
    @Autowired
    protected IStudentService studentService;
    @Autowired
    protected IStudentCheckinginService studentCheckinginService;
    @Autowired
    protected IStudentExperimentService studentExperimentService;
    @Autowired
    protected IStudentHomeworkService studentHomeworkService;
    @Autowired
    protected IStudentScoreService studentScoreService;
    @Autowired
    protected ISubjectService subjectService;
    @Autowired
    protected ITestService testService;
    @Autowired
    protected ITestTypeService testTypeService;

}

