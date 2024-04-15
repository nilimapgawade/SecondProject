package com.example.project.Dto;

import java.time.LocalDate;

import jakarta.persistence.Column;

public class UserDto {
	
	private Long userId;

	
	private String name;

	
	private String email;

	
	private String password;

	
	private int phoneNumber;

	
	private String passwordUpdated;

	
	private LocalDate createdDate;

	
	private LocalDate updatedDate;


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getPasswordUpdated() {
		return passwordUpdated;
	}


	public void setPasswordUpdated(String passwordUpdated) {
		this.passwordUpdated = passwordUpdated;
	}


	public LocalDate getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}


	public LocalDate getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	
	

}
