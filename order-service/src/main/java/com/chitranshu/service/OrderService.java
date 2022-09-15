package com.chitranshu.service;

import com.chitranshu.bean.Order;

public interface OrderService {
	public boolean saveOder(Order order);
	public Order findOrderById (long id);
}
