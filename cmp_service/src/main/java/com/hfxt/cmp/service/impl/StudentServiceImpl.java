package com.hfxt.cmp.service.impl;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */

import java.util.List;

import org.springframework.stereotype.Service;

import com.hfxt.cmp.model.search.StudentSearch;
import com.hfxt.cmp.model.vo.StudentVo;
import com.hfxt.cmp.service.IStudentService;

import common.exception.CustomException;

@Service("service.impl.StudentServiceImpl")
public class StudentServiceImpl extends BaseService implements IStudentService {
  	

    // 新添加的方法写在这里 //////////////////////////////////////////////////////////////////////////////////////////////////
	
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    /**
	 * 根据主键查询一条记录,通过'__chooseRM'控制返回的列
	 */
	// @Cacheable(value = "", key = "#root.targetClass.simpleName + #root.methodName + #id + '_' + #chooseRM")
	public StudentVo getVo_Auto(Long id, int chooseRM) throws CustomException {
		try {
			StudentVo result = studentDao.getVo_Auto(id, chooseRM);
			return result;
		}
		catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(ex.getMessage(), ex);
			}
			ex.printStackTrace();
			throw new CustomException(ex);
		}
	}
    
    
    /**
	 * 传入id,判断是否存在该记录
	 */
	// @Cacheable(value = "", key = "#root.targetClass.simpleName + #root.methodName + #id")
	public boolean isExist_Auto(Long id) throws CustomException {
		try {
			boolean result = studentDao.isExist_Auto(id);
			return result;
		}
		catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(ex.getMessage(), ex);
			}
			ex.printStackTrace();
			throw new CustomException(ex);
		}
	}
    
    
    /**
	 * 查询所有记录的数量
	 */
	// @Cacheable(value = "", key = "#root.targetClass.simpleName + #root.methodName + #id")
	public long queryCount_Auto(StudentSearch search) throws CustomException {
		try {
			long count = studentDao.queryCount_Auto(search);
			return count;
		}
		catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(ex.getMessage(), ex);
			}
			ex.printStackTrace();
			throw new CustomException(ex);
		}
	}

	/**
	 * 查询所有记录
	 */
	// @Cacheable(value = "", key = "#root.targetClass.simpleName + #root.methodName + #search.hashCode()")
	public List<StudentVo> queryVos_Auto(StudentSearch search) throws CustomException {
		try {
			List<StudentVo> result = studentDao.queryVos_Auto(search);
			return result;
		}
		catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(ex.getMessage(), ex);
			}
			ex.printStackTrace();
			throw new CustomException(ex);
		}
	}
    
    /**
	 * 查询单条记录
	 */
	// @Cacheable(value = "", key = "#root.targetClass.simpleName + #root.methodName + #search.hashCode()")
	public StudentVo queryVo_Auto(StudentSearch search) throws CustomException {
		try {
			List<StudentVo> result = studentDao.queryVos_Auto(search);
			return result == null || result.isEmpty() ? null : result.get(0);
		}
		catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(ex.getMessage(), ex);
			}
			ex.printStackTrace();
			throw new CustomException(ex);
		}
	}

	/**
	 * 后台新增
	 */
	// @CacheEvict(value = "", allEntries = true, beforeInvocation = true)
	public long save_AdminAdd(StudentVo addVo) throws CustomException {
		try {
			long addResult = studentDao.saveSelective(addVo);
			return addResult;
		}
		catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(ex.getMessage(), ex);
			}
			ex.printStackTrace();
			throw new CustomException(ex);
		}
	}

	/**
	 * 后台删除
	 */
	// @CacheEvict(value = "", allEntries = true, beforeInvocation = true)
	public long delete_AdminDelete(Long id) throws CustomException {
		try {
			// StudentVo vo = studentDao.getVo_Auto(id, StudentSearch.RM_Default);
			// if (vo == null) {
			// return -1l;
			// }
			long deleteResult = studentDao.delete(id);
			return deleteResult;
		}
		catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(ex.getMessage(), ex);
			}
			ex.printStackTrace();
			throw new CustomException(ex);
		}
	}

	/**
	 * 后台编辑
	 */
	// @CacheEvict(value = "", allEntries = true, beforeInvocation = true)
	public long edit_AdminEdit(StudentVo editVo) throws CustomException {
		try {
			long editResult = studentDao.updateSelective(editVo);
			return editResult;
		}
		catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(ex.getMessage(), ex);
			}
			ex.printStackTrace();
			throw new CustomException(ex);
		}
	}

	/**
	 * 后台查看详情
	 */
	// @Cacheable(value = "", key = "#root.targetClass.simpleName + #root.methodName + #id")
	public StudentVo getVo_AdminView(Long id) throws CustomException {
		try {
			StudentVo vo = studentDao.getVo_AdminView(id,0);
			return vo;
		}
		catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(ex.getMessage(), ex);
			}
			ex.printStackTrace();
			throw new CustomException(ex);
		}
	}

	/**
	 * 后台查询编辑
	 */
	// @Cacheable(value = "", key = "#root.targetClass.simpleName + #root.methodName + #id")
	public StudentVo getVo_preAdminEdit(Long id) throws CustomException {
		try {
			StudentVo vo = studentDao.getVo_preAdminEdit(id,0);
			return vo;
		}
		catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(ex.getMessage(), ex);
			}
			ex.printStackTrace();
			throw new CustomException(ex);
		}
	}

	/**
	 * 后台编辑
	 */
	// @Cacheable(value = "", key = "#root.targetClass.simpleName + #root.methodName + #id")
	public StudentVo getVo_AdminEdit(Long id) throws CustomException {
		try {
			StudentVo vo = studentDao.getVo_AdminEdit(id,0);
			return vo;
		}
		catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(ex.getMessage(), ex);
			}
			ex.printStackTrace();
			throw new CustomException(ex);
		}
	}
 
}
