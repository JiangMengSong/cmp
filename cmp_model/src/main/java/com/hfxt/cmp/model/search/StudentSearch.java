
package com.hfxt.cmp.model.search;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class StudentSearch extends BaseSearch {


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
     * student_name(765)
	 * dbValue == thisValue
	 */
    private String eqStudentName;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentName;
    /**
     * student_sex(765)
	 * dbValue == thisValue
	 */
    private String eqStudentSex;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentSex;
    /**
     *class_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqClassId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neClassId;
    /**
     * student_birth
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqStudentBirth; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geStudentBirth;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltStudentBirth;
    /**
     * student_phone(765)
	 * dbValue == thisValue
	 */
    private String eqStudentPhone;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentPhone;
    /**
     *major_id(10,0)
	 * dbValue == thisValue
	 */
    private Integer eqMajorId;
     /**
	 * dbValue <> thisValue
	 */
    private Integer neMajorId;
    /**
     * student_code(765)
	 * dbValue == thisValue
	 */
    private String eqStudentCode;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentCode;
    /**
     * student_address(765)
	 * dbValue == thisValue
	 */
    private String eqStudentAddress;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentAddress;
    /**
     * student_contact(765)
	 * dbValue == thisValue
	 */
    private String eqStudentContact;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentContact;
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
     * student_QQ(765)
	 * dbValue == thisValue
	 */
    private String eqStudentQQ;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentQQ;
    /**
     * student_email(765)
	 * dbValue == thisValue
	 */
    private String eqStudentEmail;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentEmail;
    /**
     * student_school(765)
	 * dbValue == thisValue
	 */
    private String eqStudentSchool;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentSchool;
    /**
     * student_entry_time
	 * dbValue = thisValue (yyyy-MM-dd)
	 */
    private java.util.Date eqStudentEntryTime; 
    /**
	 * dbValue >= thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date geStudentEntryTime;
    /**
	 * dbValue < thisValue (yyyy-MM-dd HH:mm:ss SSS)
	 */
    private java.util.Date ltStudentEntryTime;
    /**
     * student_undergraduate_major(765)
	 * dbValue == thisValue
	 */
    private String eqStudentUndergraduateMajor;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentUndergraduateMajor;
    /**
     * student_degree(765)
	 * dbValue == thisValue
	 */
    private String eqStudentDegree;
    /**
	 * dbValue like %thisValue%
	 */
    private String lkStudentDegree;
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
    
    public String getEqStudentName() {
        return eqStudentName;
    }
    public String getLkStudentName() {
        return lkStudentName;
    }
    
    public String getEqStudentSex() {
        return eqStudentSex;
    }
    public String getLkStudentSex() {
        return lkStudentSex;
    }
    
    public Integer getEqClassId() {
        return eqClassId;
    }
    public Integer getNeClassId() {
        return neClassId;
    }
    
    public java.util.Date getEqStudentBirth() {
        return eqStudentBirth;
    }
    public java.util.Date getGeStudentBirth() {
        return geStudentBirth;
    }
    public java.util.Date getLtStudentBirth() {
        return ltStudentBirth;
    }
    
    public String getEqStudentPhone() {
        return eqStudentPhone;
    }
    public String getLkStudentPhone() {
        return lkStudentPhone;
    }
    
    public Integer getEqMajorId() {
        return eqMajorId;
    }
    public Integer getNeMajorId() {
        return neMajorId;
    }
    
    public String getEqStudentCode() {
        return eqStudentCode;
    }
    public String getLkStudentCode() {
        return lkStudentCode;
    }
    
    public String getEqStudentAddress() {
        return eqStudentAddress;
    }
    public String getLkStudentAddress() {
        return lkStudentAddress;
    }
    
    public String getEqStudentContact() {
        return eqStudentContact;
    }
    public String getLkStudentContact() {
        return lkStudentContact;
    }
    
    public String getEqDesc() {
        return eqDesc;
    }
    public String getLkDesc() {
        return lkDesc;
    }
    
    public String getEqStudentQQ() {
        return eqStudentQQ;
    }
    public String getLkStudentQQ() {
        return lkStudentQQ;
    }
    
    public String getEqStudentEmail() {
        return eqStudentEmail;
    }
    public String getLkStudentEmail() {
        return lkStudentEmail;
    }
    
    public String getEqStudentSchool() {
        return eqStudentSchool;
    }
    public String getLkStudentSchool() {
        return lkStudentSchool;
    }
    
    public java.util.Date getEqStudentEntryTime() {
        return eqStudentEntryTime;
    }
    public java.util.Date getGeStudentEntryTime() {
        return geStudentEntryTime;
    }
    public java.util.Date getLtStudentEntryTime() {
        return ltStudentEntryTime;
    }
    
    public String getEqStudentUndergraduateMajor() {
        return eqStudentUndergraduateMajor;
    }
    public String getLkStudentUndergraduateMajor() {
        return lkStudentUndergraduateMajor;
    }
    
    public String getEqStudentDegree() {
        return eqStudentDegree;
    }
    public String getLkStudentDegree() {
        return lkStudentDegree;
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

	public void setEqStudentName(String eqStudentName) {
		this.eqStudentName = eqStudentName;
	}
    public void setLkStudentName(String lkStudentName) {
		this.lkStudentName = lkStudentName;
	}

	public void setEqStudentSex(String eqStudentSex) {
		this.eqStudentSex = eqStudentSex;
	}
    public void setLkStudentSex(String lkStudentSex) {
		this.lkStudentSex = lkStudentSex;
	}
    public void setEqClassId(Integer eqClassId) {
		this.eqClassId = eqClassId;
	}
    public void setNeClassId(Integer neClassId) {
		this.neClassId = neClassId;
	}
    public void setEqStudentBirth(java.util.Date eqStudentBirth) {
		this.eqStudentBirth = eqStudentBirth;
	}
    public void setGeStudentBirth(java.util.Date geStudentBirth) {
		this.geStudentBirth = geStudentBirth;
	}
    public void setLtStudentBirth(java.util.Date ltStudentBirth) {
		this.ltStudentBirth = ltStudentBirth;
	}

	public void setEqStudentPhone(String eqStudentPhone) {
		this.eqStudentPhone = eqStudentPhone;
	}
    public void setLkStudentPhone(String lkStudentPhone) {
		this.lkStudentPhone = lkStudentPhone;
	}
    public void setEqMajorId(Integer eqMajorId) {
		this.eqMajorId = eqMajorId;
	}
    public void setNeMajorId(Integer neMajorId) {
		this.neMajorId = neMajorId;
	}

	public void setEqStudentCode(String eqStudentCode) {
		this.eqStudentCode = eqStudentCode;
	}
    public void setLkStudentCode(String lkStudentCode) {
		this.lkStudentCode = lkStudentCode;
	}

	public void setEqStudentAddress(String eqStudentAddress) {
		this.eqStudentAddress = eqStudentAddress;
	}
    public void setLkStudentAddress(String lkStudentAddress) {
		this.lkStudentAddress = lkStudentAddress;
	}

	public void setEqStudentContact(String eqStudentContact) {
		this.eqStudentContact = eqStudentContact;
	}
    public void setLkStudentContact(String lkStudentContact) {
		this.lkStudentContact = lkStudentContact;
	}

	public void setEqDesc(String eqDesc) {
		this.eqDesc = eqDesc;
	}
    public void setLkDesc(String lkDesc) {
		this.lkDesc = lkDesc;
	}

	public void setEqStudentQQ(String eqStudentQQ) {
		this.eqStudentQQ = eqStudentQQ;
	}
    public void setLkStudentQQ(String lkStudentQQ) {
		this.lkStudentQQ = lkStudentQQ;
	}

	public void setEqStudentEmail(String eqStudentEmail) {
		this.eqStudentEmail = eqStudentEmail;
	}
    public void setLkStudentEmail(String lkStudentEmail) {
		this.lkStudentEmail = lkStudentEmail;
	}

	public void setEqStudentSchool(String eqStudentSchool) {
		this.eqStudentSchool = eqStudentSchool;
	}
    public void setLkStudentSchool(String lkStudentSchool) {
		this.lkStudentSchool = lkStudentSchool;
	}
    public void setEqStudentEntryTime(java.util.Date eqStudentEntryTime) {
		this.eqStudentEntryTime = eqStudentEntryTime;
	}
    public void setGeStudentEntryTime(java.util.Date geStudentEntryTime) {
		this.geStudentEntryTime = geStudentEntryTime;
	}
    public void setLtStudentEntryTime(java.util.Date ltStudentEntryTime) {
		this.ltStudentEntryTime = ltStudentEntryTime;
	}

	public void setEqStudentUndergraduateMajor(String eqStudentUndergraduateMajor) {
		this.eqStudentUndergraduateMajor = eqStudentUndergraduateMajor;
	}
    public void setLkStudentUndergraduateMajor(String lkStudentUndergraduateMajor) {
		this.lkStudentUndergraduateMajor = lkStudentUndergraduateMajor;
	}

	public void setEqStudentDegree(String eqStudentDegree) {
		this.eqStudentDegree = eqStudentDegree;
	}
    public void setLkStudentDegree(String lkStudentDegree) {
		this.lkStudentDegree = lkStudentDegree;
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
