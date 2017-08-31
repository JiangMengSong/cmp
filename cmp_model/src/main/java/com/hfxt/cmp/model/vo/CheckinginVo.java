

package com.hfxt.cmp.model.vo;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class CheckinginVo extends BaseVo {

	/**
	 *
	 */
	

	/** identifier field */

	private Integer id;
    
	/** identifier field */

	private String checkStatusName;

	/**
	 * @return 返回 id。
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id 要设置的 id。
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return 返回 checkStatusName。
	 */
	public String getCheckStatusName() {
		return checkStatusName;
	}

	/**
	 * @param checkStatusName 要设置的 checkStatusName。
	 */
	public void setCheckStatusName(String checkStatusName) {
		this.checkStatusName = checkStatusName;
	}
}
