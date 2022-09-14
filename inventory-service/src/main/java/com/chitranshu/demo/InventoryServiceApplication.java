package com.chitranshu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.chitranshu.bean.InventoryItem;
import com.chitranshu.persistence.InventoryDao;

@SpringBootApplication(scanBasePackages = "com.chitranshu")
@EnableEurekaClient
@EnableJpaRepositories(basePackages = "com.chitranshu.persistence")
@EntityScan(basePackages = "com.chitranshu.bean")
public class InventoryServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Autowired
	InventoryDao inventoryDao;
	
	@Override
	public void run(String... args) throws Exception {
		inventoryDao.save(new InventoryItem(101, "P001", 217));
		inventoryDao.save(new InventoryItem(102, "P002", 56));
		inventoryDao.save(new InventoryItem(103, "P003", 21));
		inventoryDao.save(new InventoryItem(104, "P004", 113));
	}

}
