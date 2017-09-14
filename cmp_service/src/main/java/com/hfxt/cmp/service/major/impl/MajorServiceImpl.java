package com.hfxt.cmp.service.major.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hfxt.cmp.model.Major;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.major.MajorService;

@Service("majorService")
public class MajorServiceImpl extends BaseService implements MajorService {

	@Override
	public List<Major> majorList() {
		// TODO Auto-generated method stub
		return majorMapper.majorList();
	}

	@Override
	public int deletemajor(Integer majorid) {
		return majorMapper.deletemajor(majorid);
	}

	@Override
	public int updatemajor(Major major) {
		return majorMapper.updatemajor(major);
	}

	@Override
	public int addmajor(Major major) {
		return majorMapper.addmajor(major);
	}

	@Override
	public Major selectbyid(Integer majorid) {
		return majorMapper.selectbyid(majorid);
	}
}
