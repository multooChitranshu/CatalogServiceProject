package com.chitranshu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.chitranshu.bean.Product;
import com.chitranshu.persistence.ProductDao;

@SpringBootApplication(scanBasePackages = "com.chitranshu")
@EnableEurekaClient
@EnableJpaRepositories(basePackages = "com.chitranshu.persistence")
@EntityScan(basePackages = "com.chitranshu.bean")
public class CatalogServiceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

	@Autowired
	ProductDao dao;
	
	@Override
	public void run(String... args) throws Exception {
		dao.save(new Product(1,"P001","Product1","This is 1st product",778));
		dao.save(new Product(2,"P002","Product2","This is 2nd product",500));
		dao.save(new Product(3,"P003","Product3","This is 3rd product",1250));
		dao.save(new Product(4,"P004","Product4","This is 4th product",1300));
	}

}
