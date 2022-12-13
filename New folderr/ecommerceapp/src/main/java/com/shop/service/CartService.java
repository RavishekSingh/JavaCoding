package com.shop.service;

import com.shop.exception.CartException;
import com.shop.exception.CustomerException;
import com.shop.exception.ProductException;
import com.shop.model.Cart;

public interface CartService {

	public Cart addProductToCart(Integer customerId, Integer productId)
			throws CartException, CustomerException, ProductException;

	public Cart removeProductFromCart(Integer customerId, Integer productId)
			throws CartException, CustomerException, ProductException;

	public Cart removeAllProduct(Integer customerId) throws CartException, CustomerException;

	public Cart increaseProductQuantity(Integer customerId, Integer productId)
			throws CartException, CustomerException, ProductException;

	public Cart decreaseProductQuantity(Integer customerId, Integer productId)
			throws CartException, CustomerException, ProductException;

}
