

package com.hfxt.cmp.model.vo;

/**
 * @author:wanison
 * jdk-version:jdk1.7.0_67
 * createtime：2017-08-28
 */
public class NoticeVo extends BaseVo {

	/**
	 *
	 */
	

	/** identifier field */

	private Integer id;
    
	/** identifier field */

	private String noticeTitle;
    
	/** identifier field */

	private String noticeContent;
    
	/** identifier field */

	private java.util.Date noticeNewstime;
    
	/** identifier field */

	private Integer noticeFromId;
    
	/** identifier field */

	private Integer noticeGetId;
    

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
	 * @return 返回 noticeTitle。
	 */
	public String getNoticeTitle() {
		return noticeTitle;
	}

	/**
	 * @param noticeTitle 要设置的 noticeTitle。
	 */
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	/**
	 * @return 返回 noticeContent。
	 */
	public String getNoticeContent() {
		return noticeContent;
	}

	/**
	 * @param noticeContent 要设置的 noticeContent。
	 */
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	/**
	 * @return 返回 noticeNewstime。
	 */
	public java.util.Date getNoticeNewstime() {
		return noticeNewstime;
	}

	/**
	 * @param noticeNewstime 要设置的 noticeNewstime。
	 */
	public void setNoticeNewstime(java.util.Date noticeNewstime) {
		this.noticeNewstime = noticeNewstime;
	}
	/**
	 * @return 返回 noticeFromId。
	 */
	public Integer getNoticeFromId() {
		return noticeFromId;
	}

	/**
	 * @param noticeFromId 要设置的 noticeFromId。
	 */
	public void setNoticeFromId(Integer noticeFromId) {
		this.noticeFromId = noticeFromId;
	}
	/**
	 * @return 返回 noticeGetId。
	 */
	public Integer getNoticeGetId() {
		return noticeGetId;
	}

	/**
	 * @param noticeGetId 要设置的 noticeGetId。
	 */
	public void setNoticeGetId(Integer noticeGetId) {
		this.noticeGetId = noticeGetId;
	}
}
