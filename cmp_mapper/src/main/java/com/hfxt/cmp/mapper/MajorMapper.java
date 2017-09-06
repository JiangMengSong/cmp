package com.hfxt.cmp.mapper;

import java.util.List;

import com.hfxt.cmp.model.Major;

public interface MajorMapper {
	
	List<Major> majorList();
	
    int deleteByPrimaryKey(Integer majorid);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Integer majorid);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}