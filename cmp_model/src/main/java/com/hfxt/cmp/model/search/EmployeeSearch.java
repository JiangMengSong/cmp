
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class EmployeeSearch extends BaseSearch {


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
     * employee_name(765)
	 * dbValue == thisValue
	 */
    private String eqEmployeeName;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkEmployeeName;
    /**
     * employee_address(765)
	 * dbValue == thisValue
	 */
    private String eqEmployeeAddress;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkEmployeeAddress;
    /**
     * employee_sex(765)
	 * dbValue == thisValue
	 */
    private String eqEmployeeSex;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkEmployeeSex;
    /**
     * employee_contact(765)
	 * dbValue == thisValue
	 */
    private String eqEmployeeContact;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkEmployeeContact;
    /**
     * employee_birth
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqEmployeeBirth; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geEmployeeBirth;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltEmployeeBirth;
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
     * employee_QQ(765)
	 * dbValue == thisValue
	 */
    private String eqEmployeeQQ;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkEmployeeQQ;
    /**
     * employee_entry_time
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqEmployeeEntryTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geEmployeeEntryTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltEmployeeEntryTime;
    /**
     * employee_undergraduate_major(765)
	 * dbValue == thisValue
	 */
    private String eqEmployeeUndergraduateMajor;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkEmployeeUndergraduateMajor;
    /**
     * employee_degree(765)
	 * dbValue == thisValue
	 */
    private String eqEmployeeDegree;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkEmployeeDegree;
    /**
     * employee_email(765)
	 * dbValue == thisValue
	 */
    private String eqEmployeeEmail;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkEmployeeEmail;
    /**
     * employee_phone(765)
	 * dbValue == thisValue
	 */
    private String eqEmployeePhone;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkEmployeePhone;

    
    public Integer getEqId() {
        return eqId;
    }
    public Integer getNeId() {
        return neId;
    }
    
    public String getEqEmployeeName() {
        return eqEmployeeName;
    }
    public String getLkEmployeeName() {
        return lkEmployeeName;
    }
    
    public String getEqEmployeeAddress() {
        return eqEmployeeAddress;
    }
    public String getLkEmployeeAddress() {
        return lkEmployeeAddress;
    }
    
    public String getEqEmployeeSex() {
        return eqEmployeeSex;
    }
    public String getLkEmployeeSex() {
        return lkEmployeeSex;
    }
    
    public String getEqEmployeeContact() {
        return eqEmployeeContact;
    }
    public String getLkEmployeeContact() {
        return lkEmployeeContact;
    }
    
    public java.util.Date getEqEmployeeBirth() {
        return eqEmployeeBirth;
    }
    public java.util.Date getGeEmployeeBirth() {
        return geEmployeeBirth;
    }
    public java.util.Date getLtEmployeeBirth() {
        return ltEmployeeBirth;
    }
    
    public String getEqDesc() {
        return eqDesc;
    }
    public String getLkDesc() {
        return lkDesc;
    }
    
    public String getEqEmployeeQQ() {
        return eqEmployeeQQ;
    }
    public String getLkEmployeeQQ() {
        return lkEmployeeQQ;
    }
    
    public java.util.Date getEqEmployeeEntryTime() {
        return eqEmployeeEntryTime;
    }
    public java.util.Date getGeEmployeeEntryTime() {
        return geEmployeeEntryTime;
    }
    public java.util.Date getLtEmployeeEntryTime() {
        return ltEmployeeEntryTime;
    }
    
    public String getEqEmployeeUndergraduateMajor() {
        return eqEmployeeUndergraduateMajor;
    }
    public String getLkEmployeeUndergraduateMajor() {
        return lkEmployeeUndergraduateMajor;
    }
    
    public String getEqEmployeeDegree() {
        return eqEmployeeDegree;
    }
    public String getLkEmployeeDegree() {
        return lkEmployeeDegree;
    }
    
    public String getEqEmployeeEmail() {
        return eqEmployeeEmail;
    }
    public String getLkEmployeeEmail() {
        return lkEmployeeEmail;
    }
    
    public String getEqEmployeePhone() {
        return eqEmployeePhone;
    }
    public String getLkEmployeePhone() {
        return lkEmployeePhone;
    }
    public void setEqId(Integer eqId) {
		this.eqId = eqId;
	}
    public void setNeId(Integer neId) {
		this.neId = neId;
	}

	public void setEqEmployeeName(String eqEmployeeName) {
		this.eqEmployeeName = eqEmployeeName;
	}
    public void setLkEmployeeName(String lkEmployeeName) {
		this.lkEmployeeName = lkEmployeeName;
	}

	public void setEqEmployeeAddress(String eqEmployeeAddress) {
		this.eqEmployeeAddress = eqEmployeeAddress;
	}
    public void setLkEmployeeAddress(String lkEmployeeAddress) {
		this.lkEmployeeAddress = lkEmployeeAddress;
	}

	public void setEqEmployeeSex(String eqEmployeeSex) {
		this.eqEmployeeSex = eqEmployeeSex;
	}
    public void setLkEmployeeSex(String lkEmployeeSex) {
		this.lkEmployeeSex = lkEmployeeSex;
	}

	public void setEqEmployeeContact(String eqEmployeeContact) {
		this.eqEmployeeContact = eqEmployeeContact;
	}
    public void setLkEmployeeContact(String lkEmployeeContact) {
		this.lkEmployeeContact = lkEmployeeContact;
	}
    public void setEqEmployeeBirth(java.util.Date eqEmployeeBirth) {
		this.eqEmployeeBirth = eqEmployeeBirth;
	}
    public void setGeEmployeeBirth(java.util.Date geEmployeeBirth) {
		this.geEmployeeBirth = geEmployeeBirth;
	}
    public void setLtEmployeeBirth(java.util.Date ltEmployeeBirth) {
		this.ltEmployeeBirth = ltEmployeeBirth;
	}

	public void setEqDesc(String eqDesc) {
		this.eqDesc = eqDesc;
	}
    public void setLkDesc(String lkDesc) {
		this.lkDesc = lkDesc;
	}

	public void setEqEmployeeQQ(String eqEmployeeQQ) {
		this.eqEmployeeQQ = eqEmployeeQQ;
	}
    public void setLkEmployeeQQ(String lkEmployeeQQ) {
		this.lkEmployeeQQ = lkEmployeeQQ;
	}
    public void setEqEmployeeEntryTime(java.util.Date eqEmployeeEntryTime) {
		this.eqEmployeeEntryTime = eqEmployeeEntryTime;
	}
    public void setGeEmployeeEntryTime(java.util.Date geEmployeeEntryTime) {
		this.geEmployeeEntryTime = geEmployeeEntryTime;
	}
    public void setLtEmployeeEntryTime(java.util.Date ltEmployeeEntryTime) {
		this.ltEmployeeEntryTime = ltEmployeeEntryTime;
	}

	public void setEqEmployeeUndergraduateMajor(String eqEmployeeUndergraduateMajor) {
		this.eqEmployeeUndergraduateMajor = eqEmployeeUndergraduateMajor;
	}
    public void setLkEmployeeUndergraduateMajor(String lkEmployeeUndergraduateMajor) {
		this.lkEmployeeUndergraduateMajor = lkEmployeeUndergraduateMajor;
	}

	public void setEqEmployeeDegree(String eqEmployeeDegree) {
		this.eqEmployeeDegree = eqEmployeeDegree;
	}
    public void setLkEmployeeDegree(String lkEmployeeDegree) {
		this.lkEmployeeDegree = lkEmployeeDegree;
	}

	public void setEqEmployeeEmail(String eqEmployeeEmail) {
		this.eqEmployeeEmail = eqEmployeeEmail;
	}
    public void setLkEmployeeEmail(String lkEmployeeEmail) {
		this.lkEmployeeEmail = lkEmployeeEmail;
	}

	public void setEqEmployeePhone(String eqEmployeePhone) {
		this.eqEmployeePhone = eqEmployeePhone;
	}
    public void setLkEmployeePhone(String lkEmployeePhone) {
		this.lkEmployeePhone = lkEmployeePhone;
	}

}
