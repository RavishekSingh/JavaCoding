package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.PostException;
import com.masai.model.Post;
import com.masai.repository.PostDao;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostDao pDao;
	
	@Override
	public List<Post> getAllpost() throws PostException {

		List<Post> list=pDao.findAll();
		if(list.size()>0)
		return list;
		else
			throw new PostException("No Post available");
	}

	@Override
	public Post getPostById(Integer id) throws PostException {

		Optional<Post> opt= pDao.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		else
		throw new PostException("No post available with id: "+id);
	}

	@Override
	public Post createPost(Post p) throws PostException {

		Post post= pDao.save(p);
		return post;
	}

	@Override
	public Post updatePost(Integer id) throws PostException {

		Optional<Post> opt=pDao.findById(id);
		if(opt.isPresent()) {
			
			Post p=opt.get();
			p.setCategory("Tech");
			pDao.save(p);
			return p;
		}
		else
		throw new PostException("No post available with id: "+id);

	}

	@Override
	public Post deletePost(Integer id) throws PostException {

		Optional<Post> opt=pDao.findById(id);

		if(opt.isPresent()) {
			Post p=opt.get();
		     pDao.delete(p);
		     return p;
		}
		else
		throw new PostException("No post available with id: "+id);
	}

}
