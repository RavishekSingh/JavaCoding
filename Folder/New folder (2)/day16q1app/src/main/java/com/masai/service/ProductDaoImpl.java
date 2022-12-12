package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.model.ProductDTO;
import com.masai.repository.ProductRepo;

@Service
public class ProductDaoImpl implements ProductService {

	@Autowired
	private ProductRepo pRepo;

	@Override
	public Product registerProduct(Product p) throws ProductException {

		Product pd = pRepo.save(p);

		return pd;
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {

		List<Product> pd = pRepo.findAll();

		if (pd.size() == 0)
			throw new ProductException("No Products are there");
		else
			return pd;
	}

	@Override
	public Product updateProdcut(Product p) throws ProductException {

		Optional<Product> opt = pRepo.findById(p.getProductId());

		if (opt.isPresent()) {

			Product pd = pRepo.save(p);

			return pd;
		} else
			throw new ProductException("Product does not exist :");

	}

	@Override
	public Product deleteProductById(Integer pid) throws ProductException {

		Optional<Product> opt = pRepo.findById(pid);

		if (opt.isPresent()) {

			Product existpd = opt.get();
			pRepo.delete(existpd);

			return existpd;
		} else
			throw new ProductException("Product does not exist with id :" + pid);
	}

	@Override
	public List<Product> getsProductByCategory(String category) throws ProductException {
		
		List<Product> pd = pRepo.findByCategory(category);

		if (pd.size() == 0)
			throw new ProductException("No Products are there");
		else
			return pd;
	}

	@Override
	public List<ProductDTO> getProductNameQtyPrice() throws ProductException {
		
		List<ProductDTO> pd = pRepo.getProductNameQtyPrice();

		if (pd.size() == 0)
			throw new ProductException("No Products are there");
		else
			return pd;
		
	}

}
