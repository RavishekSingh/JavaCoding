package com.shop.service;

import com.shop.exception.LoginException;
import com.shop.model.LoginDTO;

public interface LoginService {

	public String loginAccount(LoginDTO loginDTO) throws LoginException;

	public String logoutAccount(String role, String key) throws LoginException;

}
