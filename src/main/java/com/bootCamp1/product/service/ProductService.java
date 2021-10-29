package com.bootCamp1.product.service;

import java.util.List;

import com.bootCamp1.product.entity.Product;

public interface ProductService {
	
	public List<Product> findAll();
	
	public Product findById(String id);
	
	public Product save(Product product);
	
	public void delete(String id);

}
