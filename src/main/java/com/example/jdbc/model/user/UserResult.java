package com.example.jdbc.model.user;

import java.sql.Date;
import java.util.List;

public class UserResult {

	private List<User>user;
	private String password;
	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static class User{
		//private String mDate,Cdate;
		private Date mDate,Cdate;
		private String user_id,city_id,password,message;

		public Date getmDate() {
			return mDate;
		}

		public void setmDate(Date mDate) {
			this.mDate = mDate;
		}

		public Date getCdate() {
			return Cdate;
		}

		public void setCdate(Date cdate) {
			Cdate = cdate;
		}

		public String getUser_id() {
			return user_id;
		}

		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}

		public String getCity_id() {
			return city_id;
		}

		public void setCity_id(String city_id) {
			this.city_id = city_id;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

//	public String getCdate() {
//		return Cdate;
//	}
//
//	public void setCdate(String cdate) {
//		Cdate = cdate;
//	}
//
//	public String getmDate() {
//		return mDate;
//	}
//
//	public void setmDate(String mDate) {
//		this.mDate = mDate;
//	}



		@Override
		public String toString() {
			return "UserResult [mDate=" + mDate + ", Cdate=" + Cdate + ", user_id=" + user_id + ", city_id=" + city_id
					+ ", password=" + password + "]";
		}
	}



	
	
}
