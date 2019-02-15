package com.swati.dao;

import com.swati.pojo.User;

public interface IUserDAO {
public String getUserType(String userName,String password);
public void addUser(User user);
public void changePassword(String userName,String oldPassword,String newPassword);
public void removeUser(String userName);
}
