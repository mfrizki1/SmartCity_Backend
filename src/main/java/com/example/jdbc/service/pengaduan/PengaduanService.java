package com.example.jdbc.service.pengaduan;
import java.util.List;

import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.pengaduan.*;
public interface PengaduanService {
	
	
	HttpResponModel getAll();

	HttpResponModel getPengaduanByID(Pengaduan d);

}
