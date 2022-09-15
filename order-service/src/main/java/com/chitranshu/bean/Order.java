package com.chitranshu.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {
	@Id
	private long id;
	private String customerEmail;
	private String customerAddress;
	private List<OrderItem> items;
}
