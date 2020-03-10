package com.example.jdbc.model.province;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProvinceMapper implements RowMapper<ProvinceResult.Province>
{
	@Override
	public ProvinceResult.Province mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		Province province = new Province();
		province.setId(rs.getString("id"));
		province.setName(rs.getString("name"));
		
		
		ProvinceResult.Province p = new ProvinceResult.Province();
		p.setId(rs.getString("id"));
		p.setName(rs.getString("name"));
		
		return p;
	}

}
