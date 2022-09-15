package com.chitranshu.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitranshu.bean.OrderItem;

public interface OrderItemDao extends JpaRepository<OrderItem, Long> {

}
