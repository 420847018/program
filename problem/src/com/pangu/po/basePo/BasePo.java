package com.pangu.po.basePo;

import java.io.Serializable;

public class BasePo implements Serializable{

	private static final long serialVersionUID = 1L;
	private int pageStart=0;
	private int pageSize=1000;
	private String order_by;
	private String desc;
	
	
	public String getOrder_by() {
		return order_by;
	}
	public void setOrder_by(String order_by) {
		this.order_by = order_by;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPageStart() {
		return pageStart;
	}
	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
