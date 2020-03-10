package com.example.jdbc.dao.pengaduan;

import java.util.List;

import com.example.jdbc.model.pengaduan.Pengaduan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jdbc.model.pengaduan.PengaduanMapper;
import com.example.jdbc.model.pengaduan.PengaduanResult;


@Repository
@Transactional
public class PengaduanDaoImp implements PengaduanDao {

	//PengaduanResult cuy = new PengaduanResult();
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public PengaduanResult getAll() {
		PengaduanResult respon = new PengaduanResult();
		String sql = "select * from pengaduan";
		List<PengaduanResult.Pengaduan> pro = jdbctemplate.query(sql, new PengaduanMapper());
		respon.setPengaduan(pro);
		return respon;
	}

//	@Override
//	public PengaduanResult getPengaduanByID(String name) {
//		return null;
//	}

	@Override
	public PengaduanResult getPengaduanByID(Pengaduan d) {
		PengaduanResult respon = new PengaduanResult();
		// TODO Auto-generated method stub
		String sql="Select mm.name, pg.progress_type," + " SUM (value) from pengaduan pg JOIN master_month mm ON pg.month_id =" + " mm.month_id" +
				" where city_id = '"+d.getCity_id()+"' " +
				" and year = '"+d.getYear()+ "' group by mm.name, pg.progress_type order by mm.name ASC";
		List<PengaduanResult.Pengaduan> ref = jdbctemplate.query(sql, new PengaduanMapper());
		respon.setPengaduan(ref);
	//	PengaduanResult pengaduan = jdbctemplate.queryForObject(sql, new PengaduanMapper());

		return respon;
	}

}
