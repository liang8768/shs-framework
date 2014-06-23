package com.framework.shs.business.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.framework.shs.core.entity.IdEntity;

/**
 * 用户实体类
 * 
 * User.java	
 * @author Liang
 * 2014年6月23日
 */
@Entity
@Table(name="BASE_USERS")
public class User extends IdEntity{
	/**
	 * 用户登录帐号 
	 */
	private String loginId;
	/**
	 * 用户名称
	 */
	private String name;
	/**
	 * 用户年龄
	 */
	private Integer age;
	/**
	 * 登录密码
	 */
	private String password;
	@Column(name="LOGIN_ID",length=20)
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	@Column(name="NAME",length=20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="AGE",length=3)
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Column(name="PASSWORD",length=32)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
