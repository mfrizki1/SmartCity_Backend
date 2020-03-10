package com.example.jdbc.model.jpengaduan;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class JPengaduanMapper implements RowMapper<JPengaduanResult.JPengaduanR>{

	@Override
	public JPengaduanResult.JPengaduanR mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		JPengaduanResult.JPengaduanR jpengaduanr = new JPengaduanResult.JPengaduanR();
		jpengaduanr.setJenis_pengaduan_id(rs.getString("jenis_pengaduan_id"));
		jpengaduanr.setRound(rs.getInt("round"));
	//	jpengaduanr.setName(rs.getString("name"));
	//	jpengaduanr.setActive_flag(rs.getString("active_flag"));

	//	jpengaduanr.setCreated_date(rs.getDate("created_date"));
	//	jpengaduanr.setModified_date(rs.getDate("modified_date"));

	//	jpengaduanr.setDeleted(rs.getBoolean("deleted"));
		return jpengaduanr;

		//	p.setName(rs.getString("name"));
	}
	
	
	
	

}
