package com.example.jdbc.model.pengaduan;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PengaduanMapper implements RowMapper<PengaduanResult.Pengaduan> {

	@Override
	public PengaduanResult.Pengaduan mapRow(ResultSet rs,int rowNum) throws SQLException{
		
		
		Pengaduan pengaduan = new Pengaduan();
//		pengaduan.setCity_id(rs.getString("city_id"));
//		pengaduan.setJenis_pengaduan_id(rs.getString("jenis_pengaduan_id"));
//		pengaduan.setId_pengaduan(rs.getString("id_pengaduan"));
//		pengaduan.setKode(rs.getString("kode"));
//		pengaduan.setMonth_id(rs.getStr`ing("month_id"));
//		pengaduan.setProgress_type(rs.getString("progress_type"));
//		pengaduan.setValue(rs.getString("value"));
//		pengaduan.setYear(rs.getString("year"));


//		pengaduan.setModified_date(rs.getDate("modified_date"));
//		pengaduan.setCreated_date(rs.getDate("created_date"));
//
//		pengaduan.setDeleted(rs.getBoolean("deleted"));


		PengaduanResult.Pengaduan p = new PengaduanResult.Pengaduan();
//		p.setCity_id(rs.getString("city_id"));
//		p.setJenis_pengaduan_id(rs.getString("jenis_pengaduan_id"));
//		p.setId_pengaduan(rs.getString("id_pengaduan"));
//		p.setKode(rs.getString("kode"));
//		p.setMonth_id(rs.getString("month_id"));
		p.setProgress_type(rs.getString("progress_type"));
//		p.setValue(rs.getString("value"));
//		p.setYear(rs.getString("year"));

		p.setName(rs.getString("name"));
		p.setSum(rs.getInt("sum"));
//		p.setModified_date(rs.getDate("modified_date"));
//		p.setCreated_date(rs.getDate("created_date"));
//
//		p.setDeleted(rs.getBoolean("deleted"));
		return p;
	}
}
