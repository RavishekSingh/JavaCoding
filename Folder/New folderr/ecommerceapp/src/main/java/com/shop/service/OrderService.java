package com.shop.service;

import java.util.List;

import com.shop.exception.CartException;
import com.shop.exception.CustomerException;
import com.shop.exception.OrderException;
import com.shop.model.Orders;

public interface OrderService {

	public Orders addOrder(Integer cid) throws OrderException, CustomerException, CartException;

	public Orders updateOrder(Orders order) throws OrderException;

	public Orders viewOrder(Integer orderId) throws OrderException;

	public List<Orders> viewAllOrder() throws OrderException;

	public List<Orders> viewAllOrdersByUserId(Integer userId) throws OrderException;

}
