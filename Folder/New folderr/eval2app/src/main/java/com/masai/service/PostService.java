package com.masai.service;

import java.util.List;

import com.masai.exception.PostException;
import com.masai.model.Post;

public interface PostService {

	public List<Post> getAllpost()throws PostException;
	public Post getPostById(Integer id)throws PostException;
	public Post createPost(Post p)throws PostException;
	public Post updatePost(Integer id)throws PostException;
	public Post deletePost(Integer id)throws PostException;
}
