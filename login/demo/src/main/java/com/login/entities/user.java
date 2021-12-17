package com.login.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "user")
public class user 
{
	@Min(value = 1, message = "Id can't be less than 1 or bigger than 999999")
	@Max(999999)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	@Size(max = 100)
	private String username;
	@NotNull
	@Column
	@Email
	private String email;
	@NotNull
	@Column
	private String password;
	
	@Column(name="role")
	private String role;	
	
	
	@Column(name="device_type")
	private String deviceType;
	
	@Column(name = "reset_password_token")
	private String resetPasswordToken;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getResetPasswordToken() {
		return resetPasswordToken;
	}
	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", role="
				+ role + ", deviceType=" + deviceType + ", resetPasswordToken=" + resetPasswordToken + "]";
	}
	
	
	

}
