
package com.shop.service;

import java.util.List;

import com.shop.exception.AddressException;
import com.shop.exception.CustomerException;
import com.shop.exception.SessionLoginException;
import com.shop.model.Address;

public interface AddressService {

	public Address updateAddressByUserId(Address address, Integer userId, String key)
			throws AddressException, CustomerException, SessionLoginException;

	public List<Address> viewAllAddress(String key) throws AddressException, SessionLoginException;

	public Address viewAddressByUserId(Integer userId, String key) throws CustomerException, SessionLoginException;

}
