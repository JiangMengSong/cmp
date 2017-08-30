package com.hfxt.cmp.mapper;

import java.util.List;

import com.hfxt.cmp.model.search.ProductSearch;
import com.hfxt.cmp.model.vo.ProductVo;
import org.apache.ibatis.annotations.Param;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public interface IProductDao {


    // 新添加的方法写在这里 //////////////////////////////////////////////////////////////////////////////////////////////////
    
    // //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    /**
	 * 保存非空列 返回受影响行数
	 */
	long saveSelective(@Param("Vo") ProductVo vo);
    
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
	// long update(@Param("Vo") ProductVo vo);

	/**
	 * 修改非空列 返回受影响行数
	 */
	long updateSelective(@Param("Vo") ProductVo vo);

	/**
	 * 根据主键查询一条记录,通过'__chooseRM'控制返回的列
	 */
	ProductVo getVo_Auto(@Param("id") Long id, @Param("chooseRM") int chooseRM);

	/**
	 * 传入id,判断是否存在该记录
	 */
	boolean isExist_Auto(@Param("id") Long id);

	/**
	 * 查询数量
	 */
	long queryCount_Auto(@Param("ProductSearch") ProductSearch search);

	/**
	 * 查询记录集合
	 */
	List<ProductVo> queryVos_Auto(@Param("ProductSearch") ProductSearch search);

	/**
	 * 后台详情页查询
	 */
	ProductVo getVo_AdminView(@Param("id") Long id, @Param("chooseRM") int chooseRM);

	/**
	 * 后台查询编辑
	 */
	ProductVo getVo_preAdminEdit(@Param("id") Long id, @Param("chooseRM") int chooseRM);

	/**
	 * 后台编辑查询
	 */
	ProductVo getVo_AdminEdit(@Param("id") Long id, @Param("chooseRM") int chooseRM);

	/**
	 * 后台查询数量
	 */
	long queryCount_AdminList(@Param("ProductSearch") ProductSearch search);

	/**
	 * 后台查询列表
	 */
	List<ProductVo> queryVos_AdminList(@Param("ProductSearch") ProductSearch search);
    
    
	
	
}

