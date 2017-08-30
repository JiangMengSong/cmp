
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class TestTypeSearch extends BaseSearch {


    /**
     *id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neId;
    /**
     * test_name(765)
	 * dbValue == thisValue
	 */
    private String eqTestName;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkTestName;
    /**
     * desc(765)
	 * dbValue == thisValue
	 */
    private String eqDesc;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkDesc;

    
    public Integer getEqId() {
        return eqId;
    }
    public Integer getNeId() {
        return neId;
    }
    
    public String getEqTestName() {
        return eqTestName;
    }
    public String getLkTestName() {
        return lkTestName;
    }
    
    public String getEqDesc() {
        return eqDesc;
    }
    public String getLkDesc() {
        return lkDesc;
    }
    public void setEqId(Integer eqId) {
		this.eqId = eqId;
	}
    public void setNeId(Integer neId) {
		this.neId = neId;
	}

	public void setEqTestName(String eqTestName) {
		this.eqTestName = eqTestName;
	}
    public void setLkTestName(String lkTestName) {
		this.lkTestName = lkTestName;
	}

	public void setEqDesc(String eqDesc) {
		this.eqDesc = eqDesc;
	}
    public void setLkDesc(String lkDesc) {
		this.lkDesc = lkDesc;
	}

}
