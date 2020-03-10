package com.example.jdbc.controller.province;

import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.province.ProvinceResult;
import com.example.jdbc.service.province.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("province")
public class ProvinceController {
	
	@Autowired
    ProvinceService restservice;

	
	@GetMapping("/{name}")
	public ResponseEntity<HttpResponModel> getProById(@PathVariable("name") String name) {
		HttpResponModel<ProvinceResult> rest = restservice.getProById(name);
	    return ResponseEntity.ok(rest);
	}
	
	@PostMapping("/p/")//POST//POSTT//POOOOOOSSSSSSSSSSSSSSSTTTTTTTTTTTTTTTTTT
	public ResponseEntity<HttpResponModel> postProById(@PathVariable("name") String name) {
		HttpResponModel<ProvinceResult> rest = restservice.getProById(name);
	    return  ResponseEntity.ok(rest);
	}
	
	
	@GetMapping("/")
	public ResponseEntity getAll() {
		System.out.println("procon begin");
		HttpResponModel rest = restservice.getAll();
		System.out.println(rest);
		System.out.println("1");
	   // return new ResponseEntity<ProvinceResult>(listRest, HttpStatus.OK);
	    return ResponseEntity.ok(rest);
	}
	

}
