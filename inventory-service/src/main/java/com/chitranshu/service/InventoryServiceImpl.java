package com.chitranshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chitranshu.bean.InventoryItem;
import com.chitranshu.persistence.InventoryDao;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired
	InventoryDao inventoryDao;

	@Override
	public InventoryItem getInventoryItemByProductCode(String productCode) {
		List<InventoryItem> item=inventoryDao.findByProductCode(productCode);
		if(item.isEmpty()) {
			return new InventoryItem();
		}
		return item.get(0);
	}

	@Override
	public boolean updateInventoryItemQuantityByProductCode(String productCode, int availableQuantity) {
		if(inventoryDao.updateInventoryItemQuantityByProductCode(productCode, availableQuantity)>0) {
			return true;
		}
		return false;
	}

}
