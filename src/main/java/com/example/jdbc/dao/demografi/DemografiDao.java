package com.example.jdbc.dao.demografi;

import com.example.jdbc.model.demografi.Demografi;
import com.example.jdbc.model.demografi.DemografiResult;

public interface DemografiDao {

    DemografiResult postDemo(Demografi d);
}
