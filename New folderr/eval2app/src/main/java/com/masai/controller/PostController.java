package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.PostException;
import com.masai.model.Post;
import com.masai.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
	private PostService pService;
	
	
	@GetMapping("/view")
	public ResponseEntity<List<Post>> getAllPostHandler() throws PostException{
		
		return new ResponseEntity<List<Post>>(pService.getAllpost(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Post> getPostByIdHandler(@PathVariable ("id") Integer pid ) throws PostException{
		
		return new ResponseEntity<Post>(pService.getPostById(pid),HttpStatus.OK);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Post> createPostHandler(@Valid @RequestBody Post post) throws PostException{
		
		Post pt=pService.createPost(post);
           
		return new ResponseEntity<Post>(pt,HttpStatus.CREATED);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Post> updatePostHandler(@PathVariable("id") Integer pid) throws PostException{
	
		return new ResponseEntity<Post>(pService.updatePost(pid),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Post> deletePostHandler(@PathVariable("id") Integer pid) throws PostException{
	
		return new ResponseEntity<Post>(pService.deletePost(pid),HttpStatus.OK);
	}
}
