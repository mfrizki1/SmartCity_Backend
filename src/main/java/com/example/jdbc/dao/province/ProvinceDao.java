package com.example.jdbc.dao.province;


import com.example.jdbc.model.province.ProvinceResult;

public interface ProvinceDao {
	
	ProvinceResult getAll();
	
	ProvinceResult getProById(String name);
	
	ProvinceResult postProById(String name);
	
	int lastestInput();

}
