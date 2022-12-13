package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.UserException;
import com.masai.model.User;
import com.masai.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao uDao;
	
	@Override
	public User registerUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return uDao.save(user);
	}

	@Override
	public User updateUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return uDao.save(user);
	}

}
