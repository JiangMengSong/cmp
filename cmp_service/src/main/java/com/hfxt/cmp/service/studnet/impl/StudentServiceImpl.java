package com.hfxt.cmp.service.studnet.impl;

import com.hfxt.cmp.model.Student;
import com.hfxt.cmp.search.Search;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.studnet.StudentService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudentServiceImpl extends BaseService implements StudentService {
    @Override
    public List<Student> getStudent(Search stu,Integer empId) {
        return studentMapper.getStudent(stu,empId);
    }

    @Override
    public Student getStuById(Integer stuId) {
        return studentMapper.getStuById(stuId);
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
