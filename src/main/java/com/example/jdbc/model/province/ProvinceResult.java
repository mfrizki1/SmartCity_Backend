package com.example.jdbc.model.province;

import java.util.List;

public class ProvinceResult {
	private List<Province> province;
	
	public static class message{}
	public static class status{}
	public static class isSuccess{}


	 public static class Province{
		 private String id,name;

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
	 }

	public List<Province> getProvince() {
		return province;
	}

	public void setProvince(List<Province> province) {
		this.province = province;
	}

	
		
}
