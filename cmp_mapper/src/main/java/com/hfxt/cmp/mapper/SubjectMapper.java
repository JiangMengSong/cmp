package com.hfxt.cmp.mapper;

import com.hfxt.cmp.model.Subject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubjectMapper {
    //查询全部科目
    List<Subject> getAll();
    //删除科目
    int deletesub(Integer subid);
    //增加科目
    int addsub(@Param("sub") Subject sub);
    //修改科目
    int updatesub(Subject subject);
    //按条件查询
    Subject selectbyname(String subname);
    //按ID查询
    Subject selectbyid(Integer subid);

    List<Subject> getlist(Subject subject);
}