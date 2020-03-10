package com.example.jdbc.service.province;

import com.example.jdbc.dao.province.ProvinceDao;
import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.province.ProvinceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinceServiceImp implements ProvinceService {

	
	@Autowired
	private ProvinceDao provincedao;
	
	@Override
	public HttpResponModel getAll() {
		// TODO Auto-generated method stub
		//return provincedao.getAll();
		ProvinceResult dt = provincedao.getAll();
		System.out.println(dt);
		return HttpResponModel.ok(dt);
	
	}

	@Override
	public HttpResponModel<ProvinceResult> getProById(String name) {
		// TODO Auto-generated method stub
		System.out.println("PROSER DONE");
		return new HttpResponModel<ProvinceResult>(provincedao.getProById(name));
	}

	@Override
	public int lastestInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ProvinceResult postProById(String name) {
		// TODO Auto-generated method stub
		return provincedao.postProById(name);
	}

}
