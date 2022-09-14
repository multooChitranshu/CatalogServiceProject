package com.chitranshu.service;

import org.springframework.stereotype.Service;

import com.chitranshu.bean.InventoryItem;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Override
	public InventoryItem getInventoryItemByProductCode(String productCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateInventoryItemQuantityByProductCode(String productCode, int availableQuantity) {
		// TODO Auto-generated method stub
		return false;
	}

}
