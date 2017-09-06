package com.hfxt.cmp.service.studnet.impl;

import com.hfxt.cmp.model.Student;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.studnet.StudentService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudentServiceImpl extends BaseService implements StudentService {
    @Override
    public List<Student> getStudent() {
        return studentMapper.getStudent();
    }

    @Override
    public Student getStudentById(Integer stuId) {
        return studentMapper.getStudentById(stuId);
    }

    @Override
    public int addStudent(Student stu) {
        return studentMapper.addStudent(stu);
    }

    @Override
    public int updateStudent(Student stu) {
        return studentMapper.updateStudent(stu);
    }

    @Override
    public int getStuCodeIsEmpty(String stuCode) {
        return studentMapper.getStuCodeIsEmpty(stuCode);
    }

    @Override
    public int delStudent(Integer stuId) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("stuId",stuId);
        map.put("delCount",0);
        studentMapper.delStudent(map);
        return (Integer)(map.get("delCount"));
    }
}
