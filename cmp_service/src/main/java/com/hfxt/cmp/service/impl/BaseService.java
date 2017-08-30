package com.hfxt.cmp.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hfxt.cmp.mapper.IAdminUserDao;
import com.hfxt.cmp.mapper.ICheckinginDao;
import com.hfxt.cmp.mapper.IClazzDao;
import com.hfxt.cmp.mapper.IClazzExperimentDao;
import com.hfxt.cmp.mapper.IEmployeeDao;
import com.hfxt.cmp.mapper.IEmployeeLoginDao;
import com.hfxt.cmp.mapper.IInterviewDao;
import com.hfxt.cmp.mapper.IMajorDao;
import com.hfxt.cmp.mapper.INoticeDao;
import com.hfxt.cmp.mapper.IProductDao;
import com.hfxt.cmp.mapper.IRightDao;
import com.hfxt.cmp.mapper.IRoleDao;
import com.hfxt.cmp.mapper.IRoleRightDao;
import com.hfxt.cmp.mapper.IStudentDao;
import com.hfxt.cmp.mapper.IStudentCheckinginDao;
import com.hfxt.cmp.mapper.IStudentExperimentDao;
import com.hfxt.cmp.mapper.IStudentHomeworkDao;
import com.hfxt.cmp.mapper.IStudentScoreDao;
import com.hfxt.cmp.mapper.ISubjectDao;
import com.hfxt.cmp.mapper.ITestDao;
import com.hfxt.cmp.mapper.ITestTypeDao;
import common.exception.CustomException;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public abstract class BaseService {

	protected final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    protected IAdminUserDao adminUserDao;
    @Autowired
    protected ICheckinginDao checkinginDao;
    @Autowired
    protected IClazzDao clazzDao;
    @Autowired
    protected IClazzExperimentDao clazzExperimentDao;
    @Autowired
    protected IEmployeeDao employeeDao;
    @Autowired
    protected IEmployeeLoginDao employeeLoginDao;
    @Autowired
    protected IInterviewDao interviewDao;
    @Autowired
    protected IMajorDao majorDao;
    @Autowired
    protected INoticeDao noticeDao;
    @Autowired
    protected IProductDao productDao;
    @Autowired
    protected IRightDao rightDao;
    @Autowired
    protected IRoleDao roleDao;
    @Autowired
    protected IRoleRightDao roleRightDao;
    @Autowired
    protected IStudentDao studentDao;
    @Autowired
    protected IStudentCheckinginDao studentCheckinginDao;
    @Autowired
    protected IStudentExperimentDao studentExperimentDao;
    @Autowired
    protected IStudentHomeworkDao studentHomeworkDao;
    @Autowired
    protected IStudentScoreDao studentScoreDao;
    @Autowired
    protected ISubjectDao subjectDao;
    @Autowired
    protected ITestDao testDao;
    @Autowired
    protected ITestTypeDao testTypeDao;

}

