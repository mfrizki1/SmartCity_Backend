package com.example.jdbc.model.demografi;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DemografiMapper implements RowMapper<DemografiResult.Demografi> {

    @Override
    public DemografiResult.Demografi mapRow(ResultSet rs,int rowNum) throws SQLException{

        Demografi d = new Demografi(); System.out.println(";OSGH;UGB.ZKSJGB");
        d.setCity_id(rs.getString("city_id")); System.out.println("AAAAAAAAAAAAAAAAAAAA");
        d.setYear(rs.getString("year"));

        DemografiResult.Demografi dd = new DemografiResult.Demografi();
        dd.setDemographics_type(rs.getString("demographics_type"));
        dd.setName(rs.getString("name"));
        dd.setValue(rs.getInt("value"));
        dd.setYear(rs.getString("year"));
//        dd.setCity_id(rs.getString("city_id"));

        return dd;
    }
}
