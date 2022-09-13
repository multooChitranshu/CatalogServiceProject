package com.chitranshu.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chitranshu.bean.Product;
import com.chitranshu.bean.ProductList;

@RestController
public class ProductResource {
	
	@GetMapping(path = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductList listAllProducts(){
		return null;
	}
	
	@GetMapping(path = "/products /code /{productCode}")
	public Optional<Product> getProductByCode(String productCode){
		return null;
	}

}

