package com.coll.OnlineCollaboration.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.springframework.stereotype.Component;

@Component
@Entity
public class User extends DomainResponse implements Serializable{
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private String role;
	private String status;
	private boolean IsOnline;
	private boolean Enabled;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isIsOnline() {
		return IsOnline;
	}
	public void setIsOnline(boolean isOnline) {
		IsOnline = isOnline;
	}
	public boolean isEnabled() {
		return Enabled;
	}
	public void setEnabled(boolean enabled) {
		Enabled = enabled;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
