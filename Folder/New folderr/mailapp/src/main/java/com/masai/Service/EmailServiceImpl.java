package com.masai.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmailException;
import com.masai.model.Mails;
import com.masai.model.User;
import com.masai.repo.EmailRepo;

import com.masai.repo.UserRepo;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private EmailRepo eRepo;
	@Autowired
	private UserRepo uRepo;

	@Override
	public Mails createMail(Mails mail) throws EmailException {
		User user = uRepo.findById(mail.getEmail()).get();
		user.getEmails().add(mail);
		eRepo.save(mail);
		return mail;
	}

	@Override
	public Mails deleteMail(String mail) throws EmailException {
		Mails mails = eRepo.findById(mail).get();
		eRepo.deleteById(mails.getEmail());
		return mails;
	}

}
