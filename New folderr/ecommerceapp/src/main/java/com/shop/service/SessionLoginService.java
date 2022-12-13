package com.shop.service;

import com.shop.exception.SessionLoginException;

public interface SessionLoginService {

	public void checkAnyUserLoginStatus(String key) throws SessionLoginException;

	public void checkAdminUserLoginStatus(String key) throws SessionLoginException;

	public void checkCustomerUserLoginStatus(String key) throws SessionLoginException;
}
