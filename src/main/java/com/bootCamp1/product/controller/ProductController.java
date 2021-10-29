package com.bootCamp1.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootCamp1.product.entity.Product;
import com.bootCamp1.product.service.ProductService;

@RestController
@RequestMapping("/apiProducts")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/list")
	public List<Product> findAll(){
		return productService.findAll();
	}
	
	@GetMapping("/list/{id}")
	public Product findById(@PathVariable String id){
		return productService.findById(id);
	}
	
	@PostMapping("/product")
	public Product create(@RequestBody Product product) {
		return productService.save(product);
	}
	
	@PutMapping("/product/{id}")
	public Product update(@RequestBody Product product,@PathVariable String id) {
		return productService.save(product);
	}
	
	@DeleteMapping("/product/{id}")
	public void delete(@PathVariable String id) {
		productService.delete(id);
	}

}
