package com.movieda.beans;

import java.sql.Timestamp;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserBean {

	private int user_idx;
	private String user_email;
	private String user_password;
	private String user_name;
	private String user_gender;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Timestamp user_date;
	
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public Timestamp getUser_date() {
		return user_date;
	}
	public void setUser_date(Timestamp user_date) {
		this.user_date = user_date;
	}


	
	
}
