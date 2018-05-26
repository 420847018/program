package com.framework.spring.result;

import java.util.List;

public class BaseResultPojo {
	private Boolean state;
	private String msg;
	private Integer total;
	private List<Object> rows;
	private Integer maxpage;

	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Object> getRows() {
		return rows;
	}

	public void setRows(List<Object> rows) {
		this.rows = rows;
	}

	public static BaseResultPojo getSuccessInfo(String url) {
		BaseResultPojo pj = new BaseResultPojo();
		pj.setState(true);
		pj.setDescription(url);
		return pj;
	}

	public static BaseResultPojo getFailsInfo(String error) {
		BaseResultPojo pj = new BaseResultPojo();
		pj.setState(false);
		pj.setMsg(error);
		return pj;
	}

	public Integer getMaxpage() {
		return maxpage;
	}

	public void setMaxpage(Integer maxpage) {
		this.maxpage = maxpage;
	}

}
