package com.chitranshu.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chitranshu.bean.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {

}
