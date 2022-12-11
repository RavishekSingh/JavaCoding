package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.ProductException;

import com.masai.model.Product;
import com.masai.model.ProductDTO;
import com.masai.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService pService;
	
	@PostMapping("/products")
	public ResponseEntity<Product> registerProduct(@RequestBody Product pd) throws ProductException{
	
		Product prd=pService.registerProduct(pd);
		
		return new ResponseEntity<Product>(prd,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/products")
	   public ResponseEntity<List<Product>> getAllBookDetails() throws ProductException{
		  
		List<Product> prd = pService.getAllProducts();
		   return new ResponseEntity<List<Product>>(prd, HttpStatus.OK);
	   }
	
	@PutMapping("/products")
	public ResponseEntity<Product> updateProductHandler(@RequestBody Product pd) throws ProductException{
		
		Product uppd = pService.updateProdcut(pd);
		
		return new ResponseEntity<Product>(uppd,HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/products/{pid}")
	public ResponseEntity<Product> deleteProductByIdHandler(@PathVariable("pid") Integer productId) throws ProductException{
		
		Product delepd= pService.deleteProductById(productId);
		
		return new ResponseEntity<Product>(delepd,HttpStatus.OK);
		
	}
	
	@GetMapping("/getproducts/{category}")
	public ResponseEntity<List<Product>> getProductByCategory(@PathVariable("category") String category) throws ProductException{
		
		List<Product> prd = pService.getsProductByCategory(category);
		   return new ResponseEntity<List<Product>>(prd, HttpStatus.OK);
	   
	}
	
	
	@GetMapping("/getNameQtyPrice")
	public ResponseEntity<List<ProductDTO>> getNameQtyPrice() throws ProductException{
		
		
		List<ProductDTO> results= pService.getProductNameQtyPrice();
		
		
		return new ResponseEntity<List<ProductDTO>>(results,HttpStatus.OK);
		
	}
	
	
	
	
	
	
}
