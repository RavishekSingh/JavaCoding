package com.masai.service;

import com.masai.exception.EventException;

import com.masai.model.Event;


public interface EventService {

	public Event registerEvent(Event event)throws EventException;
	public Event updateEvent(String id)throws EventException;
	public Event deleteEvent(String id )throws EventException;
}
