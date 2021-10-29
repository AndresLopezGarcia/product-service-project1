package com.bootCamp1.product.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Document(collection="products")
public class Product implements Serializable{

	@Id
	private String id;
	
	@Field("productName")
	private String productName;
	
	@Field("productType")
	private String productType;
	
	@Field("comission")
	private Boolean comission;
	
	@Field("monthlyMovements")
	private Integer monthlyMovements;
	
	private static final long serialVersionUID = 1L;
	
}
