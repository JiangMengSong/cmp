package com.hfxt.cmp.mapper;

import java.util.List;

import com.hfxt.cmp.model.search.StudentExperimentSearch;
import com.hfxt.cmp.model.vo.StudentExperimentVo;
import org.apache.ibatis.annotations.Param;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public interface IStudentExperimentDao {


    // 新添加的方法写在这里 //////////////////////////////////////////////////////////////////////////////////////////////////
    
    // //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    /**
	 * 保存非空列 返回受影响行数
	 */
	long saveSelective(@Param("Vo") StudentExperimentVo vo);
    
    /**
	 * 删除 返回受影响行数
	 */
	long delete(@Param("id") Long id);

	/**
	 * 删除所有记录,返回受影响的行数
	 */
	long deleteAll();

	/**
	 * 修改 返回受影响行数
	 */
	// long update(@Param("Vo") StudentExperimentVo vo);

	/**
	 * 修改非空列 返回受影响行数
	 */
	long updateSelective(@Param("Vo") StudentExperimentVo vo);

	/**
	 * 根据主键查询一条记录,通过'__chooseRM'控制返回的列
	 */
	StudentExperimentVo getVo_Auto(@Param("id") Long id, @Param("chooseRM") int chooseRM);

	/**
	 * 传入id,判断是否存在该记录
	 */
	boolean isExist_Auto(@Param("id") Long id);

	/**
	 * 查询数量
	 */
	long queryCount_Auto(@Param("StudentExperimentSearch") StudentExperimentSearch search);

	/**
	 * 查询记录集合
	 */
	List<StudentExperimentVo> queryVos_Auto(@Param("StudentExperimentSearch") StudentExperimentSearch search);

	/**
	 * 后台详情页查询
	 */
	StudentExperimentVo getVo_AdminView(@Param("id") Long id, @Param("chooseRM") int chooseRM);

	/**
	 * 后台查询编辑
	 */
	StudentExperimentVo getVo_preAdminEdit(@Param("id") Long id, @Param("chooseRM") int chooseRM);

	/**
	 * 后台编辑查询
	 */
	StudentExperimentVo getVo_AdminEdit(@Param("id") Long id, @Param("chooseRM") int chooseRM);

	/**
	 * 后台查询数量
	 */
	long queryCount_AdminList(@Param("StudentExperimentSearch") StudentExperimentSearch search);

	/**
	 * 后台查询列表
	 */
	List<StudentExperimentVo> queryVos_AdminList(@Param("StudentExperimentSearch") StudentExperimentSearch search);
    
    
	
	
}

