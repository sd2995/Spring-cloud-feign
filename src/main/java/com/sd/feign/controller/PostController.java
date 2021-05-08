package com.sd.feign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sd.feign.client.PostClient;
import com.sd.feign.model.PostModel;

@RestController
public class PostController {
	
	@Autowired
	PostClient client ;
	
	@GetMapping("/getallposts")
	public ResponseEntity<List<PostModel>> getAllPosts(){
		
		return new ResponseEntity<List<PostModel>>(client.getPosts(), HttpStatus.OK);
		
		
	}
}
