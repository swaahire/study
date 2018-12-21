package com.freakyshoe.bean;

public class UserBean {

	private long userId;
	private String username;
	private String password;
	public UserBean(int userId, String username, String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
	}
	public UserBean()
	{
		
	}
	public UserBean(int uid)
	{
		this.userId=uid;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
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
	@Override
	public String toString() {
		return "UserPojo [userId=" + userId + ", username=" + username
				+ ", password=" + password + "]";
	}
	
}
