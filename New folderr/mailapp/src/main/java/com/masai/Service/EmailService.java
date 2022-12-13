package com.masai.Service;

import com.masai.exception.EmailException;
import com.masai.model.Mails;

public interface EmailService {

	public Mails createMail(Mails mail) throws EmailException;

	public Mails deleteMail(String mail) throws EmailException;

}
