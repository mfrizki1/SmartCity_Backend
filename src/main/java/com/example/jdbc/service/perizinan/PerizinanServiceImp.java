package com.example.jdbc.service.perizinan;

import com.example.jdbc.dao.perizinan.PerizinanDao;
import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.perizinan.Perizinan;
import com.example.jdbc.model.perizinan.PerizinanResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerizinanServiceImp implements PerizinanService {

    @Autowired
    private PerizinanDao perizinanDao;
    @Override
    public HttpResponModel postPerizinan(Perizinan p) {

        PerizinanResult pr = perizinanDao.postPerizinan(p);
        return HttpResponModel.ok(pr);
    }
}
