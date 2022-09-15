package com.chitranshu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chitranshu.bean.Order;
import com.chitranshu.persistence.OrderDao;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao orderDao;
	
	@Override
	public boolean saveOder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Order findOrderById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
