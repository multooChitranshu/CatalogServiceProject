package com.chitranshu.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chitranshu.bean.InventoryItem;
import com.chitranshu.service.InventoryService;
import com.chitranshu.service.InventoryServiceImpl;

@RestController
public class InventoryResource {
	
	@Autowired
	InventoryServiceImpl inventoryService;
	
	@GetMapping(path = "/code/{productCode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public InventoryItem getInventoryItemByProductCode (@PathVariable("productCode") String productCode) {
		return inventoryService.getInventoryItemByProductCode(productCode);
	}

	@PutMapping(path = "/code/{productCode}/{availableQuantity}", produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean updateInventoryItemQuantityByProductCode(@PathVariable("productCode") String productCode, @PathVariable("availableQuantity") int availableQuantity) {
		return inventoryService.updateInventoryItemQuantityByProductCode(productCode, availableQuantity);
	}
}
