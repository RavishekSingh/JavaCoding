package com.masai.Service;

import java.util.List;

import com.masai.exception.EmailException;

import com.masai.exception.UserException;
import com.masai.model.Mails;
import com.masai.model.Starred;
import com.masai.model.User;

public interface UserService {

	public User registerUser(User user) throws UserException;

	public List<Mails> getAllMails(String email) throws EmailException;

	public List<Mails> getstarredEmail(User user) throws EmailException;

	public User updateUser(User user) throws UserException;

}
