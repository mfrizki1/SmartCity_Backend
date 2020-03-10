package com.example.jdbc.model.refcity;

import java.util.List;

public class RefCityResult {
	
	private List<RefCity> refcity;
	
	public static class RefCity{
		//private String id,name,province_id,url_image,longtitude,latitude;
		private String id,province_id,name;
		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
		
		public String getProvince_id() {
			return province_id;
		}

		public void setProvince_id(String province_id) {
			this.province_id = province_id;
		}

	}
	
	public List<RefCity>getRefCity(){
		return refcity;
	}
	
	public void setRefCity(List<RefCity> refcity) {
	this.refcity = refcity;
	}


	
}
