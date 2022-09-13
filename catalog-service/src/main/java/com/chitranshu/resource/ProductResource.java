package com.chitranshu.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.chitranshu.bean.Product;
import com.chitranshu.bean.ProductList;
import com.chitranshu.service.ProductService;

@RestController
public class ProductResource {
	
	@Autowired
	ProductService productService;
	
	@GetMapping(path = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductList listAllProducts(){
		return productService.getProductsList();
	}
	
	@GetMapping(path = "/products/code/{productCode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Product> getProductByCode(@PathVariable("productCode") String productCode){
		return productService.getProductByCode(productCode);
	}

}

