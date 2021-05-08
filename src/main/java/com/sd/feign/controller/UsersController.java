package com.sd.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sd.feign.client.UserClient;
import com.sd.feign.model.Data;
import com.sd.feign.model.UserModel;

@RestController
@RequestMapping("/users")
public class UsersController {


	
	@Autowired
	UserClient client ;
	
	@GetMapping()
	public ResponseEntity<UserModel> getAllUsers(){
		
		return new ResponseEntity<UserModel>(client.getUsers(), HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getUser(@PathVariable int id){
		
		return new ResponseEntity<Object>(client.getUsers(id), HttpStatus.OK);
		
	}
	
	@PostMapping()
	public ResponseEntity<Object> saveUser(){
		
		System.out.println(client.SaveUser(new Data()));
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}

	
}
