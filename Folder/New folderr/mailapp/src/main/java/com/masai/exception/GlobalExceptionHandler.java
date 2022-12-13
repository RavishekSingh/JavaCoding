package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> userExceptionHandler(UserException ie, WebRequest req) {

		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));

		ResponseEntity<MyErrorDetails> re = new ResponseEntity<>(err, HttpStatus.ACCEPTED);
		return re;
	}
	
	@ExceptionHandler(EmailException.class)
	public ResponseEntity<MyErrorDetails> emailExceptionHandler(EmailException ie, WebRequest req) {

		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));

		ResponseEntity<MyErrorDetails> re = new ResponseEntity<>(err, HttpStatus.ACCEPTED);
		return re;
	}
	
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<MyErrorDetails> loginExceptionHandler(LoginException ie, WebRequest req) {

		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));

		ResponseEntity<MyErrorDetails> re = new ResponseEntity<>(err, HttpStatus.ACCEPTED);
		return re;
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> otherException(Exception ie, WebRequest req) {

		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));

		ResponseEntity<MyErrorDetails> re = new ResponseEntity<>(err, HttpStatus.ACCEPTED);
		return re;
	}

}
