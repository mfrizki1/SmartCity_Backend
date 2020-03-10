package com.example.jdbc.model.refcity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//import com.example.jdbc.model.RefCity;

public class RefCityMapper implements RowMapper<RefCityResult.RefCity>
{
	
	@Override
	public RefCityResult.RefCity mapRow(ResultSet rs, int rowNum) throws SQLException{
		RefCity refcity = new RefCity();
		refcity.setId(rs.getString("id"));
		refcity.setName(rs.getString("name"));
		refcity.setProvince_id(rs.getString("province_id"));
		
		
		RefCityResult.RefCity p = new RefCityResult.RefCity();
		p.setName(rs.getString("name"));
		p.setId(rs.getString("id"));
		p.setProvince_id(rs.getString("province_id"));
//		refcityresult.setUrl_image(rs.getString("url_image"));
//		refcityresult.setLongtitude(rs.getString("longitude"));
//		refcityresult.setLatitude(rs.getString("latitude"));
		return p;
	}

}
