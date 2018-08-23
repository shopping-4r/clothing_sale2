package com.yc.form.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class User {
	private int id;
	@NotNull(message="用户名不能为空")
	@Size(min=5,max=16,message="{name.size}")
	private String name;
	
	@NotNull(message="密码不能为空")
	@Size(min=5,max=16,message="密码的长度必须为{min}到{max}")
	private String pwd;
	
	
	@NotNull(message="邮箱不能为空")
	@Email(message = "email格式不正确")
	private String email;
	
	
	@NotNull(message="电话号码不能为空")
	private String tel;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
