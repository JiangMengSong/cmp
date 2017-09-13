package com.hfxt.cmp.service.interview;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hfxt.cmp.model.Interview;


@Transactional
public interface InterviewService {

	int deleteByPrimaryKey(Integer inteid);

    int insert(Interview record);

    int insertSelective(Interview record);

    Interview selectByPrimaryKey(Integer inteid);

    int updateByPrimaryKeySelective(Interview record);

    int updateByPrimaryKey(Interview record);
    
    List<Interview> getInterview(Interview interview);
	
}
