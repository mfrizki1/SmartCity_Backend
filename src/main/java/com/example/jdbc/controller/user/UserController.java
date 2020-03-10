package com.example.jdbc.controller.user;


import java.util.List;

import com.example.jdbc.model.HttpResponModel;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jdbc.model.user.UserResult;
import com.example.jdbc.service.user.UserService;

@Controller
@RequestMapping("users")
public class UserController {
	
@Autowired	
UserService restService;

@GetMapping("/logincuys/{city_id}")
public ResponseEntity<UserResult> getById(@PathVariable("city_id") String city_id) {
    UserResult rest = restService.getUserById(city_id);
    return new ResponseEntity<UserResult>(rest, HttpStatus.OK);
}

@PostMapping("/logincuy/")
public ResponseEntity<HttpResponModel> postById(@RequestBody UserResult.User d) {
	System.out.println(d.getUser_id());
    System.out.println(d.getPassword());
	BCrypt.hashpw(d.getPassword(), BCrypt.gensalt(12));
	System.out.println(BCrypt.hashpw(d.getPassword(), BCrypt.gensalt(12)));
	HttpResponModel<UserResult> rest = restService.postLOGIN(d);
  //  UserResult rest = restService.postLOGIN(city_id);
    return ResponseEntity.ok(rest);
}
@GetMapping("/")
public ResponseEntity<List<UserResult>> getAll() {
    List<UserResult> listRest = restService.getAll();
    return new ResponseEntity<List<UserResult>>(listRest, HttpStatus.OK);
}
	
	
}
