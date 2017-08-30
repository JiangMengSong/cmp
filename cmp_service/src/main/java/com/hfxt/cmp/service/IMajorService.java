package com.hfxt.cmp.service;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
import com.hfxt.cmp.model.search.MajorSearch;
import com.hfxt.cmp.model.vo.MajorVo;

import common.exception.CustomException;
import java.util.List;


public interface IMajorService {

  	// 新添加的方法写在这里 //////////////////////////////////////////////////////////////////////////////////////////////////
	
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
	 * 根据主键查询一条记录,通过'__chooseRM'控制返回的列
	 */
	MajorVo getVo_Auto(Long id, int chooseRM) throws CustomException;
    
    /**
	 * 传入id,判断是否存在该记录
	 */
	boolean isExist_Auto(Long id) throws CustomException;
    
    /**
	 * 查询所有记录的数量
	 */
	long queryCount_Auto(MajorSearch search) throws CustomException;

	/**
	 * 查询所有记录
	 */
	List<MajorVo> queryVos_Auto(MajorSearch search) throws CustomException;
    
    /**
	 * 查询单条记录
	 */
	MajorVo queryVo_Auto(MajorSearch search) throws CustomException;
    
    ////////////////////////////////////////////后台///////////////////////////////////////////

	/**
	 * 后台新增
	 */
	long save_AdminAdd(MajorVo addVo) throws CustomException;

	/**
	 * 后台删除
	 */
	long delete_AdminDelete(Long id) throws CustomException;

	/**
	 * 后台编辑
	 */
	long edit_AdminEdit(MajorVo editVo) throws CustomException;

	/**
	 * 后台查看编辑
	 */
	MajorVo getVo_preAdminEdit(Long id) throws CustomException;

	/**
	 * 后台编辑
	 */
	MajorVo getVo_AdminEdit(Long id) throws CustomException;

	/**
	 * 后台查看详情
	 */
	MajorVo getVo_AdminView(Long id) throws CustomException;
}
