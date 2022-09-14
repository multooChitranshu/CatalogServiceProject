package com.chitranshu.service;

import com.chitranshu.bean.InventoryItem;

public interface InventoryService {
	
	public InventoryItem getInventoryItemByProductCode(String productCode);
	public boolean updateInventoryItemQuantityByProductCode(String productCode, int availableQuantity);
}
