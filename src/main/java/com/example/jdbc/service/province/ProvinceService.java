package com.example.jdbc.service.province;

import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.province.ProvinceResult;

public interface ProvinceService {
	
//	ProvinceResult getAll();
	
	
	HttpResponModel getAll();
	HttpResponModel<ProvinceResult> getProById(String name);
	ProvinceResult postProById(String name);
	
	//HttpRes<ProvinceResult> a();

	
	int lastestInput();

}
