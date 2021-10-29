package com.bootCamp1.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bootCamp1.product.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

}
