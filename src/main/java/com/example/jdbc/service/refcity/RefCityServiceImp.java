package com.example.jdbc.service.refcity;

import com.example.jdbc.dao.refcity.RefCityDao;
import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.refcity.RefCityResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RefCityServiceImp implements RefCityService {
	
	
	@Autowired
	private RefCityDao refcitydao;
	
	@Override
	public HttpResponModel getAll(){
		RefCityResult rs = refcitydao.getAll();
		return HttpResponModel.ok(rs);
	}

	@Override
	public HttpResponModel<RefCityResult> getNameProv(String province_id) {
		//RefCityResult dt = refcitydao.getNameProv(String Province_id);
		// TODO Auto-generated method stub
		return new HttpResponModel<RefCityResult>(refcitydao.getNameProv(province_id));
	}

	@Override
	public int lastestInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RefCityResult getRefCityById(String name) {
		// TODO Auto-generated method stub
		return refcitydao.getRefCityById(name);
	}



	@Override
	public RefCityResult postRefCityById(String name) {
		// TODO Auto-generated method stub
		return refcitydao.postRefCityById(name);
	}





}
