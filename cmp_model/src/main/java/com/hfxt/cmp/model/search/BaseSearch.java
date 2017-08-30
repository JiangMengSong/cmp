package com.hfxt.cmp.model.search;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseSearch implements Serializable {

	private static final long     serialVersionUID = -1975407107689244083L;

	/**
	 * 默认的ResultMap标识
	 */
	public static final int       RM_Default       = 0;

	/**
	 * 排序类型_正序
	 */
	public static final String    Order_Type_Asc   = "asc";
	/**
	 * 排序类型_倒序
	 */
	public static final String    Order_Type_Desc  = "desc";
	/**
	 * 默认按�?序排�?
	 */
	protected static final String Order_Default    = Order_Type_Desc;
	/**
	 * 默认排序字段orders
	 */
	protected static final String Sort_Default     = "id";

	/**
	 * ResultMap 选择标识
	 */
	private int                   chooseRM         = RM_Default;

	/**
	 * 排序字段
	 */
	private String                sort             = Sort_Default;
	/**
	 * 排序类型
	 */
	private String                order            = Order_Default;

	/**
	 * 每页条数
	 */
	protected int                 rows             = Integer.MAX_VALUE;
	/**
	 * 当前页码
	 */
	protected int                 page             = 1;
	
	
	// ****wanison add********
		/**
		 * 总条�?
		 */
		protected int totalCount = 0;

		/**
		 * 总页�?
		 */
		protected int totalPage = 1;

		/**
		 * 显示出来的页码数�?
		 */
		protected int showPageNum = 5;
		/**
		 * 页码集合
		 */
		protected List<Integer> pageList;
		
		private int factoryCounts=0;//待工厂审核个�?
		
		private int goodsCounts=0;//待产品审核个�?
		
		private int completeInquiryCounts=0;//待完善的�?��询价个数
		
		private int pushInquiryCounts=0;//待推送的�?��询价个数
		
		private int orderCounts=0;//测试跟进

		public int getTotalCount() {
			return totalCount;
		}

		public void setTotalCount(int totalCount) {
			this.totalCount = totalCount;
		}

		public int getTotalPage() {
			totalPage = (totalCount - 1) / rows + 1;
			return totalPage;
		}

		public int getShowPageNum() {
			return showPageNum;
		}

		public void setShowPageNum(int showPageNum) {
			this.showPageNum = showPageNum;
		}

		public List<Integer> getPageList() {
			pageList = new ArrayList<Integer>();
			if (page < showPageNum) {
				for (int i = 1; i <= (getTotalPage() > showPageNum ? showPageNum
						: getTotalPage()); i++) {
					pageList.add(i);
				}
			} else {
				if (page
						- (showPageNum % 2 == 0 ? showPageNum / 2 - 1
								: showPageNum / 2) > 1
						&& page + showPageNum / 2 <= getTotalPage()) {
					for (int i = page
							- (showPageNum % 2 == 0 ? showPageNum / 2 - 1
									: showPageNum / 2); i <= page + showPageNum / 2; i++) {
						pageList.add(i);
					}
				} else if (page + showPageNum / 2 > getTotalPage()) {
					for (int i = getTotalPage() - showPageNum + 1; i <= getTotalPage(); i++) {
						pageList.add(i);
					}
				}
			}
			return pageList;
		}

		public void setPageList(List<Integer> pageList) {
			this.pageList = pageList;
		}
		// ****wanison add********

	
	
	public int getChooseRM() {
		return chooseRM;
	}

	public void setChooseRM(int chooseRM) {
		this.chooseRM = chooseRM;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * 从第几条�?���?
	 */
	public int getOffset() {
		return (this.page - 1) * this.rows;
	}

	/**
	 * 读多少条
	 */
	public int getLimit() {
		return this.rows;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/**
	 * @return the factoryCounts
	 */
	public int getFactoryCounts() {
		return factoryCounts;
	}

	/**
	 * @param factoryCounts the factoryCounts to set
	 */
	public void setFactoryCounts(int factoryCounts) {
		this.factoryCounts = factoryCounts;
	}

	/**
	 * @return the goodsCounts
	 */
	public int getGoodsCounts() {
		return goodsCounts;
	}

	/**
	 * @param goodsCounts the goodsCounts to set
	 */
	public void setGoodsCounts(int goodsCounts) {
		this.goodsCounts = goodsCounts;
	}

	/**
	 * @return the completeInquiryCounts
	 */
	public int getCompleteInquiryCounts() {
		return completeInquiryCounts;
	}

	/**
	 * @param completeInquiryCounts the completeInquiryCounts to set
	 */
	public void setCompleteInquiryCounts(int completeInquiryCounts) {
		this.completeInquiryCounts = completeInquiryCounts;
	}

	/**
	 * @return the pushInquiryCounts
	 */
	public int getPushInquiryCounts() {
		return pushInquiryCounts;
	}

	/**
	 * @param pushInquiryCounts the pushInquiryCounts to set
	 */
	public void setPushInquiryCounts(int pushInquiryCounts) {
		this.pushInquiryCounts = pushInquiryCounts;
	}

	/**
	 * @return the orderCounts
	 */
	public int getOrderCounts() {
		return orderCounts;
	}

	/**
	 * @param orderCounts the orderCounts to set
	 */
	public void setOrderCounts(int orderCounts) {
		this.orderCounts = orderCounts;
	}
	
	
}
