package com.springmvc.dao;

import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.model.Login;
import com.springmvc.model.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	  DataSource datasource;
	@Autowired
	  JdbcTemplate jdbcTemplate;

	@Override
	public User validateUser(Login login) {
		String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
			    + "'";
			    List<User> users = jdbcTemplate.query(sql, new UserMapper());
			    return users.size() > 0 ? users.get(0) : null;
			    }
			  }
			  class UserMapper implements RowMapper<User> {
			  public User mapRow(ResultSet rs, int arg1) throws SQLException {
			    User user = new User();
			    user.setUsername(rs.getString("username"));
			    user.setPassword(rs.getString("password"));
		return null;
	}	
}