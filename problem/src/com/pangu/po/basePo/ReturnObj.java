package com.pangu.po.basePo;

public class ReturnObj {

	private int code=0;//0为默认失败状态
	private String msg="系统错误，请联系管理员";
	private Object result=null;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	
	
}
