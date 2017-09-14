package com.hfxt.cmp.service.subject;

import com.hfxt.cmp.model.Subject;

import java.util.List;

/**
 * Created by JQY on 2017/9/12.
 */
public interface SubjectService {
    //查询全部科目
    List<Subject> getAll();
    //删除科目
    int deletesub(Integer subid);
    //增加科目
    int addsub(Subject subject);
    //修改科目
    int updatesub(Subject subject);
    //按条件查询
    Subject selectbyname(String subname);
    //按ID查询
    Subject selectbyid(Integer subid);

    List<Subject> getlist(Subject subject);
}
