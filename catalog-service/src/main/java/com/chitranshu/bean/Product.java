package com.chitranshu.bean;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	private long id;
    private String code;
    private String name;
    private String description;
    private double price;
}
