package com.hfxt.cmp.service.studnet;

import com.hfxt.cmp.model.Employee;
import com.hfxt.cmp.model.Student;
import com.hfxt.cmp.search.Search;

import java.util.List;

public interface StudentService {
    List<Student> getStudent(Search stu,Employee emp);

    Student getStuById(Integer stuId);

    int addStudent(Student stu);

    int updateStudent(Student stu);

    int getStuCodeIsEmpty(String stuCode);

    int delStudent(Integer stuId);

    Student getStuByName(String name);
}
