package com.example.jdbc.service.user;

import com.example.jdbc.dao.user.UserDao;
import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.user.User;
import com.example.jdbc.model.user.UserResult;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userdao;
	
	
	@Override
	public HttpResponModel postLOGIN(UserResult.User d) {
		UserResult ur = userdao.postLOGIN(d);
		System.out.println(d.getPassword());
		System.out.println(ur.getPassword());
		if (!BCrypt.checkpw(d.getPassword(), ur.getUser().get(0).getPassword()))
		{
			HttpResponModel respon = new HttpResponModel();
			respon.setMessage("password salah");
			return respon;
		}
		else if(ur == null) {
			HttpResponModel respon = new HttpResponModel();
			respon.setMessage("id tidak terdaftar");
			return  respon;
		}
		// TODO Auto-generated method stub
		return HttpResponModel.ok(ur);

	}
	@Override
	public List<UserResult> getAll() {
		
		// TODO Auto-generated method stub
		//return userdao.getAll();
		return null;
	}

	@Override
	public UserResult getUserById(String city_id) {
		// TODO Auto-generated method stub
	//	return userdao.getUserById(city_id);
		return null;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user, String city_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserById(String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int lastestInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
