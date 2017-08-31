
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class CheckinginSearch extends BaseSearch {


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
     * check_status_name(765)
	 * dbValue == thisValue
	 */
    private String eqCheckStatusName;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkCheckStatusName;

    
    public Integer getEqId() {
        return eqId;
    }
    public Integer getNeId() {
        return neId;
    }
    
    public String getEqCheckStatusName() {
        return eqCheckStatusName;
    }
    public String getLkCheckStatusName() {
        return lkCheckStatusName;
    }

    public void setEqId(Integer eqId) {
		this.eqId = eqId;
	}
    public void setNeId(Integer neId) {
		this.neId = neId;
	}

	public void setEqCheckStatusName(String eqCheckStatusName) {
		this.eqCheckStatusName = eqCheckStatusName;
	}
    public void setLkCheckStatusName(String lkCheckStatusName) {
		this.lkCheckStatusName = lkCheckStatusName;
	}

}
