package com.example.jdbc.dao.perizinan;

import com.example.jdbc.model.perizinan.Perizinan;
import com.example.jdbc.model.perizinan.PerizinanMapper;
import com.example.jdbc.model.perizinan.PerizinanResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class PerizinanDaoImp implements PerizinanDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public PerizinanResult postPerizinan(Perizinan p) {

        PerizinanResult respon = new PerizinanResult();
        String sql= "Select mm.name,  SUM (value) from perijinan pj JOIN master_month mm ON " +
                "pj.month_id = mm.month_id where city_id = '"+p.getCity_id()+"' " +
                "and year = '"+p.getYear()+"' group by mm.name order by mm.name ASC ";
        List<PerizinanResult.Perizinan> per = jdbcTemplate.query(sql, new PerizinanMapper());
        respon.setPerizinanL(per);
        return respon;
    }
}
