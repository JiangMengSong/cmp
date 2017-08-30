

package com.hfxt.cmp.model.vo;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class TestTypeVo extends BaseVo {

	/**
	 *
	 */
	

	/** identifier field */

	private Integer id;
    
	/** identifier field */

	private String testName;
    
	/** identifier field */

	private String desc;
    

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
	 * @return 返回 testName。
	 */
	public String getTestName() {
		return testName;
	}

	/**
	 * @param testName 要设置的 testName。
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}
	/**
	 * @return 返回 desc。
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc 要设置的 desc。
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
