package com.example.jdbc.controller.refcity;

import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.refcity.RefCityResult;
import com.example.jdbc.service.refcity.RefCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("refcity")
public class RefCityController {

	@Autowired
	RefCityService restService;
	
	@GetMapping("/{name}")
	public ResponseEntity<RefCityResult> getById(@PathVariable("name") String name) {
	    RefCityResult rest = restService.getRefCityById(name);
	    return new ResponseEntity<RefCityResult>(rest, HttpStatus.OK);

	}
	
	@GetMapping("/province/{province_id}")
	public ResponseEntity<HttpResponModel>getByIdp(@PathVariable("province_id") String province_id)
	{
	    HttpResponModel<RefCityResult> rest = restService.getNameProv(province_id);
	    return ResponseEntity.ok(rest);
	}
	
	
	@GetMapping("/")
	public ResponseEntity<HttpResponModel> getAll() {
		HttpResponModel listRest = restService.getAll();
		System.out.println(listRest);
	    return ResponseEntity.ok(listRest);
	}
	@PostMapping("/{name}")
	public ResponseEntity<RefCityResult> postById(@PathVariable("name") String name) {
	    RefCityResult rest = restService.postRefCityById(name);
	    return new ResponseEntity<RefCityResult>(rest, HttpStatus.OK);
	}
	
}
