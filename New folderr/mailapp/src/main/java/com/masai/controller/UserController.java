package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.UserService;
import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.model.Mails;
import com.masai.model.Starred;
import com.masai.model.User;



@RestController
@RequestMapping("/masaimail")
public class UserController {

	@Autowired
	private UserService uService;
	@PostMapping("/register")
	public ResponseEntity<User> registerUserHandler(@RequestBody User user) throws UserException{
		
		return new ResponseEntity<User>(uService.registerUser(user), HttpStatus.CREATED);
	}
	@GetMapping("/mail/{mail}")
	public ResponseEntity<List<Mails>> getmailHandler(@PathVariable("mail") String mail) throws UserException, EmailException{
		
		return new ResponseEntity<List<Mails>>(uService.getAllMails(mail), HttpStatus.OK);
	}
	@GetMapping("/starred")
	public ResponseEntity<List<Mails>> getStarredHandler(@RequestBody User user) throws UserException, EmailException{
		
		return new ResponseEntity<List<Mails>>(uService.getstarredEmail(user), HttpStatus.OK);
	}
	@PutMapping("/user")
	public ResponseEntity<User> updateUserHandler(@RequestBody User user) throws UserException{
		
		return new ResponseEntity<User>(uService.updateUser(user), HttpStatus.CREATED);
	}
}
