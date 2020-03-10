package com.example.jdbc.dao.province;

import com.example.jdbc.model.province.ProvinceMapper;
import com.example.jdbc.model.province.ProvinceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Repository
@Transactional
public class ProvinceDaoImp implements ProvinceDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public ProvinceResult getAll() {
		ProvinceResult respon = new ProvinceResult();
		String sql="select * from ref_province";
		List<ProvinceResult.Province> pro = jdbcTemplate.query(sql, new ProvinceMapper());
		respon.setProvince(pro);
		// TODO Auto-generated method stub
		return respon;
	}

	@Override
	public ProvinceResult getProById(String name) {
		ProvinceResult r = new ProvinceResult();
		List<ProvinceResult.Province> zzz= new ArrayList<ProvinceResult.Province>();
		String sql2 = "select id from ref_province where replace(lower(name), ' ','') like '%"+name+"%'";
		System.out.println(sql2);
		/*
		 * ProvinceResult rest2 = jdbcTemplate.queryForObject(sql2,new
		 * ProvinceMapper()); return rest2;
		 */
		 String provins = jdbcTemplate.queryForObject(sql2,String.class);
		 System.out.println("sasasasasasa");
		 
		 ProvinceResult.Province cityResult = new ProvinceResult.Province();
		 cityResult.setId(provins);
		 zzz.add(cityResult);
		 r.setProvince(zzz);
		 System.out.println("dddd");
		// TODO Auto-generated method stub
		return r;
	}

	@Override
	public int lastestInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ProvinceResult postProById(String name) {
		return null;
		// TODO Auto-generated method stub
		/*
		 * String sql2 = "select * from ref_province where id = ?"; ProvinceResult rest2
		 * = jdbcTemplate.queryForObject(sql2, new Object[]{name}, new
		 * ProvinceMapper()); return rest2;
		 */
	}

}
