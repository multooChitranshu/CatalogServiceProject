package com.chitranshu.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chitranshu.bean.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {
	List<Product> findByCode(String prodName);
}
