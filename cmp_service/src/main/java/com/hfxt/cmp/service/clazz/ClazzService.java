package com.hfxt.cmp.service.clazz;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hfxt.cmp.model.Clazz;

@Transactional
public interface ClazzService {

	List<Clazz> getClazz();
	
    int deleteByPrimaryKey(Integer clazzid);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Integer clazzid);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}
