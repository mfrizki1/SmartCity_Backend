package com.example.jdbc.service.demografi;

import com.example.jdbc.dao.demografi.DemografiDao;
import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.demografi.Demografi;
import com.example.jdbc.model.demografi.DemografiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemografiServiceImp implements DemografiService {

    @Autowired
    private DemografiDao demografiDao;

    @Override
    public HttpResponModel postDemo(Demografi d) {

        DemografiResult dr = demografiDao.postDemo(d);
        return HttpResponModel.ok(dr);
    }
}
