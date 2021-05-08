package com.sd.feign.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sd.feign.model.PostModel;

@FeignClient(url = "https://jsonplaceholder.typicode.com" , name = "posts-client")
public interface PostClient {

	@GetMapping("/posts")
	public List<PostModel> getPosts();
	
}

