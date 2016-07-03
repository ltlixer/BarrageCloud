package com.llx.bc.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "barrage")
public class Barrage {
	
	@Id
	@GeneratedValue
    @Column(name="id")
	private int id;
	
	//账号
	@Column(name = "username",unique=true,nullable=false,length=18)
	private String username;
	//密码
	@Column(name = "password",nullable=false,length=30)
	private String password;
	//姓名
	@Column(name = "realname",length=16,nullable=false)
	private String realname;
	//邮箱
	@Column(name = "email",nullable=false)
	private String email;
	//秘钥
	@Column(name = "api_key",nullable=false)
	private String apiKey;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	
}
