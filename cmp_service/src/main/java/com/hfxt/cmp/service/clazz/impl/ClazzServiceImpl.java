package com.hfxt.cmp.service.clazz.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hfxt.cmp.model.Clazz;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.clazz.ClazzService;

@Service("clazzService")
public class ClazzServiceImpl extends BaseService implements ClazzService {

	@Override
	public List<Clazz> getClazz() {
		// TODO Auto-generated method stub
		return clazzMapper.getClazz();
	}

	@Override
	public int deleteByPrimaryKey(Integer clazzid) {
		// TODO Auto-generated method stub
		return clazzMapper.deleteByPrimaryKey(clazzid);
	}

	@Override
	public int insert(Clazz record) {
		// TODO Auto-generated method stub
		return clazzMapper.insert(record);
	}

	@Override
	public int insertSelective(Clazz record) {
		// TODO Auto-generated method stub
		return clazzMapper.insertSelective(record);
	}

	@Override
	public Clazz selectByPrimaryKey(Integer clazzid) {
		// TODO Auto-generated method stub
		return clazzMapper.selectByPrimaryKey(clazzid);
	}

	@Override
	public int updateByPrimaryKeySelective(Clazz record) {
		// TODO Auto-generated method stub
		return clazzMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(Clazz record) {
		// TODO Auto-generated method stub
		return clazzMapper.updateByPrimaryKey(record);
	}

}
