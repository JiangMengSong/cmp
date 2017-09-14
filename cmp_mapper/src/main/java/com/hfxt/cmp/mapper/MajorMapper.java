package com.hfxt.cmp.mapper;

import java.util.List;

import com.hfxt.cmp.model.Major;

public interface MajorMapper {

    //查询全部
    List<Major> majorList();
    //删除专业
    int deletemajor(Integer majorid);
    //修改专业
    int updatemajor(Major major);
    //添加专业
    int addmajor(Major major);
    //按条件查询专业
    Major selectbyid(Integer majorid);
}