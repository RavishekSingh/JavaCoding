package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EventException;
import com.masai.exception.UserException;
import com.masai.model.Event;
import com.masai.model.User;
import com.masai.service.EventService;

@RestController
@RequestMapping("/masaicalender")
public class EventController {

	@Autowired
	private EventService eService;
	
	@PostMapping("/event")
	public ResponseEntity<Event> registerEventHandler(@Valid @RequestBody Event event) throws EventException{
		
		return new ResponseEntity<Event>(eService.registerEvent(event),HttpStatus.CREATED);
	}
	
	@PutMapping("/event/{id}")
	public ResponseEntity<Event> updateEventHandler(@PathVariable ("id") String id) throws EventException{
		
		return new ResponseEntity<Event>(eService.updateEvent(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/event/{id}")
	public ResponseEntity<Event> deleteEventHandler(@PathVariable ("id") String id) throws EventException{
		
		return new ResponseEntity<Event>(eService.deleteEvent(id),HttpStatus.OK);
	}
}
