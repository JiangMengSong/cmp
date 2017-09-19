package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.Employee;
import com.hfxt.cmp.model.Student;
import com.hfxt.cmp.search.Search;
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

    /**
     * 获取所有学生(允许带条件)
     * @param stu 查询条件
     * @return
     */
    List<Student> getStudent(@Param("stu") Search stu,@Param("emp") Employee emp);

    /**
     * 根据ID获取单个学生
     * @param stuId 学生Id
     * @return
     */
    Student getStuById(@Param("stuId") Integer stuId);

    /**
     * 根据id删除学生
     * @param map 存储过程参数
     * @return
     */
    int delStudent(@Param("map")Map<String,Object> map);

    /**
     * 查询学生编号是否存在
     * @param stuCode 学生编号
     */
    int getStuCodeIsEmpty(@Param("stuCode") String stuCode);

    //通过name查询
   Student getStuByName( String loginName);
}