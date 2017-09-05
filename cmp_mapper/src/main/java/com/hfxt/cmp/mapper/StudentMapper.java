package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.Student;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 根据id删除学生
     * @param stuId 学生Id
     */
    int delStudent(@Param("stuId")Integer stuId);

    /**
     * 根据学生Id获取指定学生信息
     * @param stuId 学生Id
     */
    Student getStudentById(@Param("stuId")Integer stuId);
}