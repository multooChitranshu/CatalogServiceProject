package com.chitranshu.persistence;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.chitranshu.bean.InventoryItem;

@Repository
public interface InventoryDao extends JpaRepository<InventoryItem, Long> {
	
	List<InventoryItem> findByProductCode(String productCode);
	
	@Modifying
	@Transactional
	@Query(name = "UPDATE InventoryItem SET availableQuantity=?2"
			+ " WHERE productCode=?1 ", nativeQuery = true)
	int updateInventoryItemQuantityByProductCode(String productCode, int availableQuantity);
}
