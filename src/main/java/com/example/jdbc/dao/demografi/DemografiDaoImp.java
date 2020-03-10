package com.example.jdbc.dao.demografi;

import com.example.jdbc.model.demografi.Demografi;
import com.example.jdbc.model.demografi.DemografiMapper;
import com.example.jdbc.model.demografi.DemografiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class DemografiDaoImp implements DemografiDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public DemografiResult postDemo(Demografi d) {

        DemografiResult respon = new DemografiResult();
        String sql="select dg.name, year, value, demographics_type,city_id from" +
                " demographics dm JOIN demographics_group dg ON " +
                "dm.demographics_group_id = dg.demographics_group_id where dm.city_id = '"+d.getCity_id()+"'" +
                "and dm.year = '"+d.getYear()+"'";

        List<DemografiResult.Demografi> demo = jdbcTemplate.query(sql, new DemografiMapper());
        respon.setDemografis(demo);
        return respon;
    }
}
