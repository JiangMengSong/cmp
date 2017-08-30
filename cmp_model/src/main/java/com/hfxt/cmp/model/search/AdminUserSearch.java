
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class AdminUserSearch extends BaseSearch {


    /**
     *id(19,0)
	 * dbValue == thisValue
	 */
    private Long eqId;
     /**
	 * dbValue <> thisValue
	 */
    private Long neId;
    /**
     * login_name(765)
	 * dbValue == thisValue
	 */
    private String eqLoginName;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkLoginName;
    /**
     * login_pass(765)
	 * dbValue == thisValue
	 */
    private String eqLoginPass;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkLoginPass;
    /**
     * login_salt(765)
	 * dbValue == thisValue
	 */
    private String eqLoginSalt;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkLoginSalt;
    /**
     *updater_id(19,0)
	 * dbValue == thisValue
	 */
    private Long eqUpdaterId;
     /**
	 * dbValue <> thisValue
	 */
    private Long neUpdaterId;
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

    
    public Long getEqId() {
        return eqId;
    }
    public Long getNeId() {
        return neId;
    }
    
    public String getEqLoginName() {
        return eqLoginName;
    }
    public String getLkLoginName() {
        return lkLoginName;
    }
    
    public String getEqLoginPass() {
        return eqLoginPass;
    }
    public String getLkLoginPass() {
        return lkLoginPass;
    }
    
    public String getEqLoginSalt() {
        return eqLoginSalt;
    }
    public String getLkLoginSalt() {
        return lkLoginSalt;
    }
    
    public Long getEqUpdaterId() {
        return eqUpdaterId;
    }
    public Long getNeUpdaterId() {
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
    public void setEqId(Long eqId) {
		this.eqId = eqId;
	}
    public void setNeId(Long neId) {
		this.neId = neId;
	}

	public void setEqLoginName(String eqLoginName) {
		this.eqLoginName = eqLoginName;
	}
    public void setLkLoginName(String lkLoginName) {
		this.lkLoginName = lkLoginName;
	}

	public void setEqLoginPass(String eqLoginPass) {
		this.eqLoginPass = eqLoginPass;
	}
    public void setLkLoginPass(String lkLoginPass) {
		this.lkLoginPass = lkLoginPass;
	}

	public void setEqLoginSalt(String eqLoginSalt) {
		this.eqLoginSalt = eqLoginSalt;
	}
    public void setLkLoginSalt(String lkLoginSalt) {
		this.lkLoginSalt = lkLoginSalt;
	}
    public void setEqUpdaterId(Long eqUpdaterId) {
		this.eqUpdaterId = eqUpdaterId;
	}
    public void setNeUpdaterId(Long neUpdaterId) {
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
