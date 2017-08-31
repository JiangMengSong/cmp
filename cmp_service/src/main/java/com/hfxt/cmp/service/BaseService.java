package com.hfxt.cmp.service;

import com.hfxt.cmp.mapper.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-31
 */
public abstract class BaseService {

	protected final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    protected StudentMapper studentMapper;
    @Autowired
    protected ClazzMapper clazzMapper;
    @Autowired
    protected EmployeeMapper employeeMapper;
    @Autowired
    protected EmpCheckingMapper empCheckingMapper;
    @Autowired
    protected ExperimentTypeMapper experimentTypeMapper;
    @Autowired
    protected InterviewMapper interviewMapper;
    @Autowired
    protected MajorMapper majorMapper;
    @Autowired
    protected StuCheckingMapper stuCheckinginMapper;
    @Autowired
    protected StuExperimentMapper stuExperimentMapper;
    @Autowired
    protected SubjectMapper subMapper;

}

