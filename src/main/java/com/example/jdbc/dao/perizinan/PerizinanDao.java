package com.example.jdbc.dao.perizinan;

import com.example.jdbc.model.perizinan.Perizinan;
import com.example.jdbc.model.perizinan.PerizinanResult;

public interface PerizinanDao {

    PerizinanResult postPerizinan(Perizinan p);
}
