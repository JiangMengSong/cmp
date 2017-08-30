
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class RightSearch extends BaseSearch {


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
     * right_code(765)
	 * dbValue == thisValue
	 */
    private String eqRightCode;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkRightCode;
    /**
     * right_parent_code(765)
	 * dbValue == thisValue
	 */
    private String eqRightParentCode;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkRightParentCode;
    /**
     * right_title(765)
	 * dbValue == thisValue
	 */
    private String eqRightTitle;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkRightTitle;
    /**
     * right_url(765)
	 * dbValue == thisValue
	 */
    private String eqRightUrl;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkRightUrl;
    /**
     * desc(765)
	 * dbValue == thisValue
	 */
    private String eqDesc;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkDesc;
    /**
     *creator_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqCreatorId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neCreatorId;
    /**
     * create_time
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqCreateTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geCreateTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltCreateTime;
    /**
     *updater_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqUpdaterId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neUpdaterId;
    /**
     * update_time
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqUpdateTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geUpdateTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltUpdateTime;

    
    public Integer getEqId() {
        return eqId;
    }
    public Integer getNeId() {
        return neId;
    }
    
    public String getEqRightCode() {
        return eqRightCode;
    }
    public String getLkRightCode() {
        return lkRightCode;
    }
    
    public String getEqRightParentCode() {
        return eqRightParentCode;
    }
    public String getLkRightParentCode() {
        return lkRightParentCode;
    }
    
    public String getEqRightTitle() {
        return eqRightTitle;
    }
    public String getLkRightTitle() {
        return lkRightTitle;
    }
    
    public String getEqRightUrl() {
        return eqRightUrl;
    }
    public String getLkRightUrl() {
        return lkRightUrl;
    }
    
    public String getEqDesc() {
        return eqDesc;
    }
    public String getLkDesc() {
        return lkDesc;
    }
    
    public Integer getEqCreatorId() {
        return eqCreatorId;
    }
    public Integer getNeCreatorId() {
        return neCreatorId;
    }
    
    public java.util.Date getEqCreateTime() {
        return eqCreateTime;
    }
    public java.util.Date getGeCreateTime() {
        return geCreateTime;
    }
    public java.util.Date getLtCreateTime() {
        return ltCreateTime;
    }
    
    public Integer getEqUpdaterId() {
        return eqUpdaterId;
    }
    public Integer getNeUpdaterId() {
        return neUpdaterId;
    }
    
    public java.util.Date getEqUpdateTime() {
        return eqUpdateTime;
    }
    public java.util.Date getGeUpdateTime() {
        return geUpdateTime;
    }
    public java.util.Date getLtUpdateTime() {
        return ltUpdateTime;
    }
    public void setEqId(Integer eqId) {
		this.eqId = eqId;
	}
    public void setNeId(Integer neId) {
		this.neId = neId;
	}

	public void setEqRightCode(String eqRightCode) {
		this.eqRightCode = eqRightCode;
	}
    public void setLkRightCode(String lkRightCode) {
		this.lkRightCode = lkRightCode;
	}

	public void setEqRightParentCode(String eqRightParentCode) {
		this.eqRightParentCode = eqRightParentCode;
	}
    public void setLkRightParentCode(String lkRightParentCode) {
		this.lkRightParentCode = lkRightParentCode;
	}

	public void setEqRightTitle(String eqRightTitle) {
		this.eqRightTitle = eqRightTitle;
	}
    public void setLkRightTitle(String lkRightTitle) {
		this.lkRightTitle = lkRightTitle;
	}

	public void setEqRightUrl(String eqRightUrl) {
		this.eqRightUrl = eqRightUrl;
	}
    public void setLkRightUrl(String lkRightUrl) {
		this.lkRightUrl = lkRightUrl;
	}

	public void setEqDesc(String eqDesc) {
		this.eqDesc = eqDesc;
	}
    public void setLkDesc(String lkDesc) {
		this.lkDesc = lkDesc;
	}
    public void setEqCreatorId(Integer eqCreatorId) {
		this.eqCreatorId = eqCreatorId;
	}
    public void setNeCreatorId(Integer neCreatorId) {
		this.neCreatorId = neCreatorId;
	}
    public void setEqCreateTime(java.util.Date eqCreateTime) {
		this.eqCreateTime = eqCreateTime;
	}
    public void setGeCreateTime(java.util.Date geCreateTime) {
		this.geCreateTime = geCreateTime;
	}
    public void setLtCreateTime(java.util.Date ltCreateTime) {
		this.ltCreateTime = ltCreateTime;
	}
    public void setEqUpdaterId(Integer eqUpdaterId) {
		this.eqUpdaterId = eqUpdaterId;
	}
    public void setNeUpdaterId(Integer neUpdaterId) {
		this.neUpdaterId = neUpdaterId;
	}
    public void setEqUpdateTime(java.util.Date eqUpdateTime) {
		this.eqUpdateTime = eqUpdateTime;
	}
    public void setGeUpdateTime(java.util.Date geUpdateTime) {
		this.geUpdateTime = geUpdateTime;
	}
    public void setLtUpdateTime(java.util.Date ltUpdateTime) {
		this.ltUpdateTime = ltUpdateTime;
	}

}
