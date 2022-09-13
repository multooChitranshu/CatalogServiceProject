package com.chitranshu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chitranshu.bean.Product;
import com.chitranshu.bean.ProductList;
import com.chitranshu.persistence.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productDao;

	@Override
	public ProductList getProductsList() {
		return new ProductList(productDao.findAll());
	}

	@Override
	public Optional<Product> getProductByCode(String prodCode) {
		List<Product> prod=productDao.findByCode(prodCode);
		if(prod.isEmpty()) {
			return Optional.empty();
		}
		return Optional.ofNullable(prod.get(0));
	}

}
