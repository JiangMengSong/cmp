package com.hfxt.cmp.service.studnet;

import com.hfxt.cmp.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudent();

    Student getStudentById(Integer stuId);
}
