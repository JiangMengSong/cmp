package com.hfxt.cmp.service.studnet.impl;

import com.hfxt.cmp.model.Clazz;
import com.hfxt.cmp.model.Employee;
import com.hfxt.cmp.model.Student;
import com.hfxt.cmp.search.Search;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.studnet.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("studentService")
@Transactional
public class StudentServiceImpl extends BaseService implements StudentService {
    @Override
    public List<Student> getStudent(Search stu,Employee emp) {
        return studentMapper.getStudent(stu,emp);
    }

    @Override
    public Student getStuById(Integer stuId) {
        return studentMapper.getStuById(stuId);
    }

    @Override
    public int addStudent(Student stu) {
        /*Map<String,Object> map = new HashMap<String,Object>();
        map.put("stuName",stu.getStuname());
        map.put("stuSex",stu.getStusex());
        map.put("classId",stu.getClazz().getClazzid());
        map.put("stuBirth",stu.getStubirth());
        map.put("stuPhone",stu.getStuphone());
        map.put("stuCode",stu.getStucode());
        map.put("stuAddress",stu.getStuaddress());
        map.put("stuContact",stu.getStucontact());
        map.put("stuHead",stu.getStuhead());
        map.put("stuDesc",stu.getStudesc());
        map.put("stuQQ",stu.getStuqq());
        map.put("stuEmail",stu.getStuemail());
        map.put("stuEntryTime",stu.getStuentrytime());
        map.put("studegree",stu.getStudegree());
        map.put("addCount",0);
        studentMapper.addStudent(map);
        return (Integer)(map.get("addCount"));*/
        Clazz clazz = clazzMapper.selectByPrimaryKey(stu.getClazz().getClazzid());
        clazz.setStunum(clazz.getStunum()+1);
        clazzMapper.updateByPrimaryKey(clazz);
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
