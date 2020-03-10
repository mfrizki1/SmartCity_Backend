package com.example.jdbc.service.refcity;

import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.refcity.RefCityResult;

public interface RefCityService {

	HttpResponModel getAll();
	HttpResponModel<RefCityResult> getNameProv(String province_id);
	
	
	RefCityResult getRefCityById(String name);
	
	RefCityResult postRefCityById(String name);
	
	int lastestInput();
}
