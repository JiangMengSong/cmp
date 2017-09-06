package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    /**
     * 添加学生信息
     * @param stu 学生
     */
    int addStudent(@Param("stu") Student stu);

    /**
     * 修改学生信息
     * @param stu 学生信息
     */
    int updateStudent(@Param("stu") Student stu);

//    int updateByPrimaryKey(Student record);

    /**
     * 获取所有学生
     * */
    List<Student> getStudent();

    /**
     * 根据id删除学生
     */
    int delStudent(@Param("map")Map<String,Object> map);

    /**
     * 根据学生Id获取指定学生信息
     * @param stuId 学生Id
     */
    Student getStudentById(@Param("stuId")Integer stuId);

    /**
     * 查询学生编号是否存在
     * @param stuCode 学生编号
     */
    int getStuCodeIsEmpty(@Param("stuCode") String stuCode);
}