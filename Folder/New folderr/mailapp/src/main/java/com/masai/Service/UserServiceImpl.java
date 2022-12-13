package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmailException;
import com.masai.exception.LoginException;
import com.masai.exception.UserException;
import com.masai.model.Mails;
import com.masai.model.Starred;
import com.masai.model.User;
import com.masai.repo.EmailRepo;
import com.masai.repo.StarRepo;
import com.masai.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo uRepo;
	@Autowired
	private EmailRepo eRepo;

	@Override
	public User registerUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return uRepo.save(user);
	}

	@Override
	public User updateUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return uRepo.save(user);
	}

	@Override
	public List<Mails> getAllMails(String email) throws EmailException {
		User user = uRepo.findById(email).get();
		return user.getEmails();
	}

	@Override
	public List<Mails> getstarredEmail(User user) throws EmailException {
		return uRepo.findById(user.getEmail()).get().getStar();
	}

}
