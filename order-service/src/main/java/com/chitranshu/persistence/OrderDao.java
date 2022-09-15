package com.chitranshu.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitranshu.bean.Order;

public interface OrderDao extends JpaRepository<Order, Long> {

}
