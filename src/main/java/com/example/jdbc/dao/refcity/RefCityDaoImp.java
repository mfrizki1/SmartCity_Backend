package com.example.jdbc.dao.refcity;

//import java.util.ArrayList;

import com.example.jdbc.model.refcity.RefCityMapper;
import com.example.jdbc.model.refcity.RefCityResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class RefCityDaoImp implements RefCityDao {
	
	@Autowired
	private  JdbcTemplate jdbcTemplate;
	
	

	@Override
	public RefCityResult getNameProv(String province_id) {
		// TODO Auto-generated method stub
		RefCityResult respon = new RefCityResult();
//		List<RefCityResult.RefCity> ref= new ArrayList<RefCityResult.RefCity>();
		String sql2 = "select * from ref_city where province_id ='"+province_id+"'";
		List<RefCityResult.RefCity> ref = jdbcTemplate.query(sql2, new RefCityMapper());
		respon.setRefCity(ref);
//		String RefCityns = jdbcTemplate.queryForObject(sql2,String.class);
//		System.out.println("sasasasasasa");
//
//		RefCityResult.RefCity ccit = new RefCityResult.RefCity();
//		ccit.setId(RefCityns);
//		ref.add(ccit);
//		respon.setRefCity(ref);
	//	 List<RefCityResult> cityResult = new ArrayList<RefCityResult>();
//		 refcity2.forEach(d->{
//			 RefCityResult data = new RefCityResult();
//			 data.setName(d);
//			 cityResult.add(data);
//		 });
		// TODO Auto-generated method stub
		return respon;
	}

	@Override
	public RefCityResult getAll() {
//		String sql="select * from ref_city";
//		List<RefCityResult> refcity = jdbcTemplate.query(sql, new RefCityMapper());
		RefCityResult respon = new RefCityResult();
		String sql="select * from ref_city";
		List<RefCityResult.RefCity> ref = jdbcTemplate.query(sql, new RefCityMapper());
		respon.setRefCity(ref);
		return respon;
	}

	@Override
	public RefCityResult getRefCityById(String nama) {
//		String sql2 = "select id from ref_city where replace(lower(name), ' ','') like '%"+nama+"%'";
//		 String refcity2 = jdbcTemplate.queryForObject(sql2,String.class);
//		 RefCityResult cityResult = new RefCityResult();
//		 cityResult.setId(refcity2);
		
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public int lastestInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RefCityResult postRefCityById(String name) {
//		String sql2 = "select id from ref_city where replace(lower(name), ' ','') like '%{name}%'";
//		RefCityResult refcity2 = jdbcTemplate.queryForObject(sql2, new Object[]{name}, new RefCityMapper());
//		
//		// TODO Auto-generated method stub
		return null;
			// TODO Auto-generated method stub
		
	}


}
