package org.comit.course.BEAN;

public class user {

String userId;
String password;
String loginStatus;

public user() {
	userId = "";
	password = "";
	loginStatus= "";
	
	System.out.println(userId);
	System.out.println(password);
	System.out.println(loginStatus);
}

public user(String userId, String password, String loginStatus) {
	super();
	this.userId = userId;
	this.password = password;
	this.loginStatus = loginStatus;
}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getLoginStatus() {
	return loginStatus;
}

public void setLoginStatus(String loginStatus) {
	this.loginStatus = loginStatus;
}
}