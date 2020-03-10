package com.example.jdbc.controller.pengaduan;

import java.util.List;

import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.pengaduan.Pengaduan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jdbc.model.pengaduan.PengaduanResult;
import com.example.jdbc.service.pengaduan.PengaduanService;

@Controller
@RequestMapping("pengaduans")
public class PengaduanController {
	
	@Autowired
	PengaduanService pengenService;
	
	
	@PostMapping("/pengaduan/")
	public ResponseEntity getPengaduanByID(@RequestBody Pengaduan d)
	{
		HttpResponModel t = pengenService.getPengaduanByID(d);
		//return new ResponseEntity<PengaduanResult>(t, HttpStatus.OK);
		return ResponseEntity.ok(t);
	}
	
	@GetMapping("/")
	public ResponseEntity getAll()
	{
		HttpResponModel rest = pengenService.getAll();
		return ResponseEntity.ok(rest);
	}
	

}
