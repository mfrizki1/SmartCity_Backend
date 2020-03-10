package com.example.jdbc.service.pengaduan;

import java.util.List;

import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.pengaduan.Pengaduan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jdbc.dao.pengaduan.PengaduanDao;
import com.example.jdbc.model.pengaduan.PengaduanResult;


@Service
public class PengaduanServiceImp implements PengaduanService{
	
	@Autowired
	private PengaduanDao pengaduanDao;

	@Override
	public HttpResponModel getAll() {
		// TODO Auto-generated method stub
		PengaduanResult dr =pengaduanDao.getAll();
		System.out.println(dr);
		return HttpResponModel.ok(dr);
	}

	@Override
	public HttpResponModel getPengaduanByID(Pengaduan d) {

		PengaduanResult pr = pengaduanDao.getPengaduanByID(d);
		//pengaduanDao.getPengaduanByID(d);
		return HttpResponModel.ok(pr);
	}

//	@Override
//	public HttpResponModel getPengaduanByID(PengaduanResult pengaduanALL) {
//		// TODO Auto-generated method stub
//		return new HttpResponModel (pengaduanDao.getPengaduanByID(pengaduanALL));
//	}

}
