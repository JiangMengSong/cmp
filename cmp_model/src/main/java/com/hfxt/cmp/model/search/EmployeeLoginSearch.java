
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class EmployeeLoginSearch extends BaseSearch {


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
     *enable_status(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqEnableStatus;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neEnableStatus;
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
    /**
     *orders(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqOrders;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neOrders;
    /**
     * nick_name(765)
	 * dbValue == thisValue
	 */
    private String eqNickName;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkNickName;
    /**
     *role_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqRoleId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neRoleId;
    /**
     *employee_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqEmployeeId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neEmployeeId;

    
    public Integer getEqId() {
        return eqId;
    }
    public Integer getNeId() {
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
    
    public Integer getEqEnableStatus() {
        return eqEnableStatus;
    }
    public Integer getNeEnableStatus() {
        return neEnableStatus;
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
    
    public Integer getEqOrders() {
        return eqOrders;
    }
    public Integer getNeOrders() {
        return neOrders;
    }
    
    public String getEqNickName() {
        return eqNickName;
    }
    public String getLkNickName() {
        return lkNickName;
    }
    
    public Integer getEqRoleId() {
        return eqRoleId;
    }
    public Integer getNeRoleId() {
        return neRoleId;
    }
    
    public Integer getEqEmployeeId() {
        return eqEmployeeId;
    }
    public Integer getNeEmployeeId() {
        return neEmployeeId;
    }
    public void setEqId(Integer eqId) {
		this.eqId = eqId;
	}
    public void setNeId(Integer neId) {
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
    public void setEqEnableStatus(Integer eqEnableStatus) {
		this.eqEnableStatus = eqEnableStatus;
	}
    public void setNeEnableStatus(Integer neEnableStatus) {
		this.neEnableStatus = neEnableStatus;
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
    public void setEqOrders(Integer eqOrders) {
		this.eqOrders = eqOrders;
	}
    public void setNeOrders(Integer neOrders) {
		this.neOrders = neOrders;
	}

	public void setEqNickName(String eqNickName) {
		this.eqNickName = eqNickName;
	}
    public void setLkNickName(String lkNickName) {
		this.lkNickName = lkNickName;
	}
    public void setEqRoleId(Integer eqRoleId) {
		this.eqRoleId = eqRoleId;
	}
    public void setNeRoleId(Integer neRoleId) {
		this.neRoleId = neRoleId;
	}
    public void setEqEmployeeId(Integer eqEmployeeId) {
		this.eqEmployeeId = eqEmployeeId;
	}
    public void setNeEmployeeId(Integer neEmployeeId) {
		this.neEmployeeId = neEmployeeId;
	}

}
