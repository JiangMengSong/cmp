package com.hfxt.cmp.service.studnet.impl;

import com.hfxt.cmp.model.Student;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.studnet.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl extends BaseService implements StudentService {
    @Override
    public List<Student> getStudent() {
        return studentMapper.getStudent();
    }
}
