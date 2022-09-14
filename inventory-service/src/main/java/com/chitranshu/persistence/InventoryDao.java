package com.chitranshu.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chitranshu.bean.InventoryItem;

@Repository
public interface InventoryDao extends JpaRepository<InventoryItem, Long> {

}
