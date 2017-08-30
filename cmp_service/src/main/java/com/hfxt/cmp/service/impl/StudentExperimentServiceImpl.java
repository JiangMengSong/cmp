package com.hfxt.cmp.service.impl;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */

import java.util.List;

import org.springframework.stereotype.Service;

import com.hfxt.cmp.model.search.StudentExperimentSearch;
import com.hfxt.cmp.model.vo.StudentExperimentVo;
import com.hfxt.cmp.service.IStudentExperimentService;
import com.hfxt.cmp.service.impl.BaseService;

import common.exception.CustomException;

@Service("service.impl.StudentExperimentServiceImpl")
public class StudentExperimentServiceImpl extends BaseService implements IStudentExperimentService {
  	

    // 新添加的方法写在这里 //////////////////////////////////////////////////////////////////////////////////////////////////
	
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    /**
	 * 根据主键查询一条记录,通过'__chooseRM'控制返回的列
	 */
	// @Cacheable(value = "", key = "#root.targetClass.simpleName + #root.methodName + #id + '_' + #chooseRM")
	public StudentExperimentVo getVo_Auto(Long id, int chooseRM) throws CustomException {
		try {
			StudentExperimentVo result = studentExperimentDao.getVo_Auto(id, chooseRM);
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
			boolean result = studentExperimentDao.isExist_Auto(id);
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
	public long queryCount_Auto(StudentExperimentSearch search) throws CustomException {
		try {
			long count = studentExperimentDao.queryCount_Auto(search);
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
	public List<StudentExperimentVo> queryVos_Auto(StudentExperimentSearch search) throws CustomException {
		try {
			List<StudentExperimentVo> result = studentExperimentDao.queryVos_Auto(search);
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
	public StudentExperimentVo queryVo_Auto(StudentExperimentSearch search) throws CustomException {
		try {
			List<StudentExperimentVo> result = studentExperimentDao.queryVos_Auto(search);
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
	public long save_AdminAdd(StudentExperimentVo addVo) throws CustomException {
		try {
			long addResult = studentExperimentDao.saveSelective(addVo);
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
			// StudentExperimentVo vo = studentExperimentDao.getVo_Auto(id, StudentExperimentSearch.RM_Default);
			// if (vo == null) {
			// return -1l;
			// }
			long deleteResult = studentExperimentDao.delete(id);
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
	public long edit_AdminEdit(StudentExperimentVo editVo) throws CustomException {
		try {
			long editResult = studentExperimentDao.updateSelective(editVo);
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
	public StudentExperimentVo getVo_AdminView(Long id) throws CustomException {
		try {
			StudentExperimentVo vo = studentExperimentDao.getVo_AdminView(id,0);
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
	public StudentExperimentVo getVo_preAdminEdit(Long id) throws CustomException {
		try {
			StudentExperimentVo vo = studentExperimentDao.getVo_preAdminEdit(id,0);
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
	public StudentExperimentVo getVo_AdminEdit(Long id) throws CustomException {
		try {
			StudentExperimentVo vo = studentExperimentDao.getVo_AdminEdit(id,0);
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
