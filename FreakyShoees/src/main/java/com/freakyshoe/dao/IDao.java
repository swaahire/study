package com.freakyshoe.dao;


import com.freakyshoe.bean.UserBean;

public interface IDao {
	public int add(UserBean u);
	public int delete(UserBean u);

}
