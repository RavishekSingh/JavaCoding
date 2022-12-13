package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EventException;
import com.masai.exception.UserException;
import com.masai.model.Event;
import com.masai.model.User;
import com.masai.repository.EventDao;
import com.masai.repository.UserDao;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventDao eDao;

	@Override
	public Event registerEvent(Event event) throws EventException {
		// TODO Auto-generated method stub
		return eDao.save(event);
	}

	@Override
	public Event updateEvent(String id) throws EventException {
	
		 Optional<Event> ev=eDao.findById(id);
		 if(ev.isPresent()) {
			 Event event=ev.get();
			 event.setName("Tech");
			 return event;
		 }
		 else
			 
		throw new EventException("No event found with id: "+id);
	}

	@Override
	public Event deleteEvent(String id) throws EventException {
		 Optional<Event> ev=eDao.findById(id);
		 if(ev.isPresent()) {
			 Event event=ev.get();
			 eDao.delete(event);
			 return event;
		 }
		 else
			 
		throw new EventException("No event found with id: "+id);
	}
	
	

}
