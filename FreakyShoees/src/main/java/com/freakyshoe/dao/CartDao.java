package com.freakyshoe.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.freakyshoe.bean.UserBean;


public class CartDao implements IDao{


	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	@Override
	public int add(UserBean u) {
		  String query="insert into userDetails values('"+u.getUserId()+"','"+u.getUsername()+"','"+u.getPassword()+"')";  
		    return jdbcTemplate.update(query);  
	}

	@Override
	public int delete(UserBean u) {
		  String query="delete from userDetails where userId='"+u.getUserId()+"' ";  
		    return jdbcTemplate.update(query);  
	}
	


	@Override
	public String toString() {
		return "UserDao [jdbcTemplate=" + jdbcTemplate + "]";
	}

	
}
