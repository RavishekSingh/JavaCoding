package com.masai.controller;

import java.util.List;

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

import com.masai.Service.EmailService;
import com.masai.Service.UserService;
import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.model.Mails;
import com.masai.model.User;

@RestController
@RequestMapping("/masaimail")
public class MailController {

	@Autowired
	private EmailService eService;
	@PostMapping("/mail")
	public ResponseEntity<Mails> mailHandler(@RequestBody Mails mail) throws UserException, EmailException{
		
		return new ResponseEntity<Mails>(eService.createMail(mail), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{mail}")
	public ResponseEntity<Mails> updateUserHandler(@PathVariable("mail") String mail) throws UserException, EmailException{
		
		return new ResponseEntity<Mails>(eService.deleteMail(mail), HttpStatus.CREATED);
	}
}

