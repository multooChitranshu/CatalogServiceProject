package com.chitranshu.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chitranshu.bean.Product;
import com.chitranshu.persistence.ProductDao;

@SpringBootTest
public class TestDao {
	@Autowired
	ProductDao dao;
	
	@Nested
	class FindByCode{
		@Test
		public void findByCode_T01() {
			Product product=new Product(1,"P001","Product1","This is 1st product",778);
			assertIterableEquals(Arrays.asList(product), dao.findByCode("P001"));
		}
		
		@Test
		public void findByCode_T02() {
			assertEquals(new ArrayList<Product>(), dao.findByCode("P099"));
		}
		
	}
}
