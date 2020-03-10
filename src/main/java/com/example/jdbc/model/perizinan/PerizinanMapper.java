package com.example.jdbc.model.perizinan;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PerizinanMapper implements RowMapper<PerizinanResult.Perizinan> {

    @Override
    public PerizinanResult.Perizinan mapRow(ResultSet rs,int rowNum) throws SQLException{

        Perizinan perizinan = new Perizinan();
//        perizinan.setCity_id(rs.getString("city_id"));
//        perizinan.setYear(rs.getString("year"));


        PerizinanResult.Perizinan pr = new PerizinanResult.Perizinan();
        pr.setName(rs.getString("name"));
        pr.setSum(rs.getString("sum"));

        return pr;
    }

}
