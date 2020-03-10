package com.example.jdbc.service.user;

import java.util.List;

import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.user.User;
import com.example.jdbc.model.user.UserResult;

public interface UserService {
	
	List<UserResult> getAll();
	
	UserResult getUserById(String city_id);
	
	HttpResponModel<UserResult> postLOGIN(UserResult.User d);
	
	void addUser (User user);
	
	void updateUser (User user,String city_id);
	
	void deleteUserById (String user);
	
	int lastestInput();

}
