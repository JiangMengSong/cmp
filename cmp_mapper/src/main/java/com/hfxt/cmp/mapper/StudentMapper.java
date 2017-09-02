package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer stuid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /**
     * 获取所有学生
     * */
    List<Student> getStudent();
}