package com.example.jdbc.service.perizinan;

import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.perizinan.Perizinan;

public interface PerizinanService {

    HttpResponModel postPerizinan(Perizinan p);
}
