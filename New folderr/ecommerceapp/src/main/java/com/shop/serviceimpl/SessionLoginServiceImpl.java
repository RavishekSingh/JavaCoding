package com.shop.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.exception.SessionLoginException;
import com.shop.model.CurrentUserSession;
import com.shop.repository.CurrentUserSessionRepo;
import com.shop.service.SessionLoginService;

@Service
public class SessionLoginServiceImpl implements SessionLoginService {

	@Autowired
	private CurrentUserSessionRepo sessionRepo;

	@Override
	public void checkAnyUserLoginStatus(String key) throws SessionLoginException {
		CurrentUserSession currSess = sessionRepo.findByPrivateKey(key);
		if (currSess == null)
			throw new SessionLoginException("User login required");
	}

	@Override
	public void checkAdminUserLoginStatus(String key) throws SessionLoginException {
		CurrentUserSession currSess = sessionRepo.findByPrivateKey(key);
		if (currSess != null && !currSess.getRole().equalsIgnoreCase("admin"))
			throw new SessionLoginException("Admin login required");
	}

	@Override
	public void checkCustomerUserLoginStatus(String key) throws SessionLoginException {
		CurrentUserSession currSess = sessionRepo.findByPrivateKey(key);
		if (currSess != null && !currSess.getRole().equalsIgnoreCase("customer"))
			throw new SessionLoginException("Admin login required");
	}

}
