package com.example.jdbc.dao.user;

import java.util.List;

import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.user.User;
import com.example.jdbc.model.user.UserResult;

public interface UserDao {
	
	List<UserResult.User> getAll();
	
	UserResult.User getUserById(String city_id);
	
	UserResult postLOGIN(UserResult.User d);
	
	void addUser(User user);
	
	void updateUser(User user,String city_id);
	
	void  deleteUserById(String id);
	
	int lastestInput();
}
