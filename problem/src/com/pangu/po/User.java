package com.pangu.po;

import com.pangu.po.basePo.BasePo;

public class User extends BasePo{
	private static final long serialVersionUID = 1L;
	private Long id_index;
	private String user_name;
	private String pass_word;
	private String nick_name;
	private Integer user_type;
	
	
	
	public Long getId_index() {
		return id_index;
	}
	public void setId_index(Long id_index) {
		this.id_index = id_index;
	}
	public Integer getUser_type() {
		return user_type;
	}
	public void setUser_type(Integer user_type) {
		this.user_type = user_type;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPass_word() {
		return pass_word;
	}
	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	
	
	
}
