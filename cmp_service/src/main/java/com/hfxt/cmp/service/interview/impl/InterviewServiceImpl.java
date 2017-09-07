package com.hfxt.cmp.service.interview.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hfxt.cmp.model.Interview;
import com.hfxt.cmp.service.BaseService;
import com.hfxt.cmp.service.interview.InterviewService;

@Service("interviewService")
public class InterviewServiceImpl extends BaseService implements InterviewService {

	@Override
	public int deleteByPrimaryKey(Integer inteid) {
		// TODO Auto-generated method stub
		return interviewMapper.deleteByPrimaryKey(inteid);
	}

	@Override
	public int insert(Interview record) {
		// TODO Auto-generated method stub
		return interviewMapper.insert(record);
	}

	@Override
	public int insertSelective(Interview record) {
		// TODO Auto-generated method stub
		return interviewMapper.insertSelective(record);
	}

	@Override
	public Interview selectByPrimaryKey(Integer inteid) {
		// TODO Auto-generated method stub
		return interviewMapper.selectByPrimaryKey(inteid);
	}

	@Override
	public int updateByPrimaryKeySelective(Interview record) {
		// TODO Auto-generated method stub
		return interviewMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Interview record) {
		// TODO Auto-generated method stub
		return interviewMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Interview> getInterview(Interview interview) {
		// TODO Auto-generated method stub
		return interviewMapper.getInterview(interview);
	}

	
}
