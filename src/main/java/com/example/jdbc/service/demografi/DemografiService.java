package com.example.jdbc.service.demografi;

import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.demografi.Demografi;

public interface DemografiService {

    HttpResponModel postDemo(Demografi d);

}
