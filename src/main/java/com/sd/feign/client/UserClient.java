package com.sd.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sd.feign.model.Data;
import com.sd.feign.model.UserModel;

@FeignClient(url = "https://gorest.co.in/public-api" , name = "user-client")
public interface UserClient {

	@GetMapping("/users")
	public UserModel getUsers();
	
	@GetMapping("/users/{id}")
	public Data getUsers(@PathVariable int id);
	
	@PostMapping("/users")
	public Data SaveUser(@RequestBody Data user);
	
}
