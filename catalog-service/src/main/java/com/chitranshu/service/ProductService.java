package com.chitranshu.service;

import com.chitranshu.bean.Product;
import com.chitranshu.bean.ProductList;

public interface ProductService {	
	ProductList getProductsList();
	Product getProductByCode();
}
