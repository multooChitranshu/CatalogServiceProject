package com.chitranshu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
	private long id;
    private long productId;
    private int quantity;
    private double productPrice;
}
