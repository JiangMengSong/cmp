package com.hfxt.cmp.service.major;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hfxt.cmp.model.Major;

@Transactional
public interface MajorService {
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
