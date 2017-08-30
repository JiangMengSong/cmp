

package com.hfxt.cmp.model.vo;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class AdminUserVo extends BaseVo {

	/**
	 *
	 */
	

	/** identifier field */

	private Long id;
    
	/** identifier field */

	private String loginName;
    
	/** identifier field */

	private String loginPass;
    
	/** identifier field */

	private String loginSalt;
    
	/** identifier field */

	private Long updaterId;
    
	/** identifier field */

	private java.util.Date updateTime;
    

	/**
	 * @return 返回 id。
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id 要设置的 id。
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return 返回 loginName。
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @param loginName 要设置的 loginName。
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * @return 返回 loginPass。
	 */
	public String getLoginPass() {
		return loginPass;
	}

	/**
	 * @param loginPass 要设置的 loginPass。
	 */
	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}
	/**
	 * @return 返回 loginSalt。
	 */
	public String getLoginSalt() {
		return loginSalt;
	}

	/**
	 * @param loginSalt 要设置的 loginSalt。
	 */
	public void setLoginSalt(String loginSalt) {
		this.loginSalt = loginSalt;
	}
	/**
	 * @return 返回 updaterId。
	 */
	public Long getUpdaterId() {
		return updaterId;
	}

	/**
	 * @param updaterId 要设置的 updaterId。
	 */
	public void setUpdaterId(Long updaterId) {
		this.updaterId = updaterId;
	}
	/**
	 * @return 返回 updateTime。
	 */
	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime 要设置的 updateTime。
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
}
