package com.example.jdbc.model.user;

import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<UserResult.User> {
	@Override
	public UserResult.User mapRow(ResultSet rs,int rowNum) throws SQLException{
//		User user = new User();
//		user.setUser_id(rs.getString("user_id"));
//		user.setCity_id(rs.getString("city_id"));
//		user.setPassword(rs.getString("password"));
		
		UserResult.User u = new UserResult.User();
//		userresult.setCdate(rs.getDate("created_date"));
//		userresult.setmDate(rs.getDate("modified_date"));
		u.setUser_id(rs.getString("user_id"));
		u.setCity_id(rs.getString("city_id"));
		u.setPassword(rs.getString("password"));
		return u;
	}

}
