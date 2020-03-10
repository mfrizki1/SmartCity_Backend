package com.example.jdbc.dao.refcity;

import com.example.jdbc.model.refcity.RefCityResult;

public interface RefCityDao {
	
	RefCityResult getAll();
	
	RefCityResult getNameProv(String province_id);
	
	RefCityResult getRefCityById(String name);
	
	
	RefCityResult postRefCityById(String name);
	
	int lastestInput();
//	void addUser (RefCity name);

}
