package com.example.jdbc.dao.jpengaduan;

import com.example.jdbc.model.jpengaduan.JPengaduan;
import com.example.jdbc.model.jpengaduan.JPengaduanMapper;
import com.example.jdbc.model.jpengaduan.JPengaduanResult;
import com.example.jdbc.model.pengaduan.Pengaduan;
import com.example.jdbc.model.pengaduan.PengaduanResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class JPengaduanDaoImp implements JPengaduanDao {

    @Autowired
    private JdbcTemplate jdbctemplate;
    @Override
    public JPengaduanResult getJID(JPengaduan d) {

        JPengaduanResult respoon = new JPengaduanResult();
        String sql="Select pg.jenis_pengaduan_id, Round(cast(float8 (SUM (value) / (select SUM (value) from pengaduan " +
                   "where city_id = '"+d.getCity_id()+"' and year = '"+d.getYear()+"')) * 100 as numeric), 2)" +
                   " from pengaduan pg where city_id =  '"+d.getCity_id()+"' and '"+d.getYear()+"' = '2018' group by pg.jenis_pengaduan_id";

        List<JPengaduanResult.JPengaduanR> ref = jdbctemplate.query(sql,new JPengaduanMapper());
        respoon.setJpengaduanr(ref);
        return respoon;
    }
}
