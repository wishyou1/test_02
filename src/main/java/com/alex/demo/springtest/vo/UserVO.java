package com.alex.demo.springtest.vo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户信息
 * </p>
 *
 * @author Ht
 * @since 2019-07-17
 */

@ApiModel(value = "User对象", description = "用户信息")
public class UserVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long userId;

	@ApiModelProperty(value = "用户名")
	private String userName;

	@ApiModelProperty(value = "登录名")
	private String loginName;

	@ApiModelProperty(value = "密码", hidden = true)
	private String password;

	@ApiModelProperty(value = "手机号")
	private String mobile;

	@ApiModelProperty(value = "邮箱")
	private String email;

	@ApiModelProperty(value = "所在城市代码")
	private String city;

	@ApiModelProperty(value = "注册时间")
	private Date joinTime;

	@ApiModelProperty(value = "最后登录时间")
	private Date lastLogin;

	@ApiModelProperty(value = "用户状态 'N' 正常 'L' 锁定")
	private String userStatus;

	@ApiModelProperty(value = "创建时间", hidden = true)
	@TableField(fill = FieldFill.INSERT)
	private Date ct;

	@ApiModelProperty(value = "更新时间", hidden = true)
	private Date ut;

	@ApiModelProperty(value = "删除标识位 0 未删除  1 已删除", hidden = true)
	private Integer isDel;

	@ApiModelProperty(value = "乐观锁标识", hidden = true)
	private Long version;

	private String domainId;

	@ApiModelProperty(value = "办公电话")
	private String officePhone;

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public Date getCt() {
		return ct;
	}

	public void setCt(Date ct) {
		this.ct = ct;
	}

	public Date getUt() {
		return ut;
	}

	public void setUt(Date ut) {
		this.ut = ut;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String toString() {
		return "UserVO{" + "userId=" + userId + ", userName=" + userName + ", loginName=" + loginName + ", password="
				+ password + ", mobile=" + mobile + ", email=" + email + ", city=" + city + ", joinTime=" + joinTime
				+ ", lastLogin=" + lastLogin + ", userStatus=" + userStatus + ", ct=" + ct + ", ut=" + ut + ", isDel="
				+ isDel + ", version=" + version + "}";
	}
}
