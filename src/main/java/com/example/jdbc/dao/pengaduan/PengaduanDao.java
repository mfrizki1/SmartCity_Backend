package com.example.jdbc.dao.pengaduan;

import java.util.List;
 
import com.example.jdbc.model.pengaduan.*;
public interface PengaduanDao {
	
	PengaduanResult getAll();
	
	
	PengaduanResult getPengaduanByID (Pengaduan d);

}
