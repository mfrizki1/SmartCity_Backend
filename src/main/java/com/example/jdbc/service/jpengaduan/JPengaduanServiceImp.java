package com.example.jdbc.service.jpengaduan;

import com.example.jdbc.dao.jpengaduan.JPengaduanDao;
import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.jpengaduan.JPengaduan;
import com.example.jdbc.model.jpengaduan.JPengaduanResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JPengaduanServiceImp implements JPengaduanService {

    @Autowired
    private JPengaduanDao jPengaduanDao;


    @Override
    public HttpResponModel getJID(JPengaduan d) {

        JPengaduanResult jpr = jPengaduanDao.getJID(d);
        return HttpResponModel.ok(jpr);
    }
}
