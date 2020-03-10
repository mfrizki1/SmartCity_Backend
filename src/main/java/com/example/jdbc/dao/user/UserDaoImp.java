package com.example.jdbc.dao.user;

import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.user.User;
import com.example.jdbc.model.user.UserMapper;
import com.example.jdbc.model.user.UserResult;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDaoImp implements UserDao {
	
	@Autowired
	private  JdbcTemplate jdbcTemplate;

	@Override
	public List<UserResult.User> getAll() {
		String sql="select * from users";
		List<UserResult.User> user = jdbcTemplate.query(sql, new UserMapper());
		// TODO Auto-generated method stub
		return user;
	}
	
	@Override
	public UserResult postLOGIN(UserResult.User d) {
		UserResult userResult = new UserResult();
		String passwordEncrypt = (BCrypt.hashpw(d.getPassword(), BCrypt.gensalt(12))); // password yg sudah di encrypt
		String sql = "select * from users where city_id = '"+d.getCity_id()+"' and user_id = '"+d.getUser_id()+"'";
		List<UserResult.User> u = jdbcTemplate.query(sql, new UserMapper());
		userResult.setUser(u);
		//userResult.

		if (userResult == null) {
//			HttpResponModel respon = new HttpResponModel();
		//	respon.setUser(u);
//			respon.setMessage("id tidak terdaftar");
			return null;
		}
//		if (!BCrypt.checkpw(d.getPassword(), userResult.getPassword()))
//		{
//			HttpResponModel respon = new HttpResponModel();
//			respon.setMessage("password salah");
//			return respon;
//		}

		// TODO Auto-generated method stub
		userResult.setUser(u);
		return userResult;
		//return null;
	}
	@Override
	public UserResult.User getUserById(String city_id) {
		String sql = "select * from users where city_id = @cityId and user_id = @userId and password = @password";
		UserResult.User user = jdbcTemplate.queryForObject(sql, new Object[]{city_id}, new UserMapper());
		// TODO Auto-generated method stub
		return user;
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
	public void deleteUserById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int lastestInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
