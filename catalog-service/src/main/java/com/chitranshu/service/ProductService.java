package com.chitranshu.service;

import java.util.Optional;

import com.chitranshu.bean.Product;
import com.chitranshu.bean.ProductList;

public interface ProductService {	
	ProductList getProductsList();
	Optional<Product> getProductByCode(String prodCode);
}
