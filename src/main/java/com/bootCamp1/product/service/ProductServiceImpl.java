package com.bootCamp1.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootCamp1.product.entity.Product;
import com.bootCamp1.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	public ProductRepository productRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		
		return productRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Product findById(String id) {
		
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public Product save(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public void delete(String id) {
		
		productRepository.deleteById(id);
	}
	
	

}
