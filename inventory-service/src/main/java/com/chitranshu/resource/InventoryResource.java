package com.chitranshu.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chitranshu.bean.InventoryItem;

@RestController
public class InventoryResource {
	@GetMapping(path = "/code/{productCode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public InventoryItem getInventoryItemByProductCode (String productCode) {
		return null;
	}

	@PutMapping(path = "/code/{productCode}/{availableQuantity}", produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean updateInventoryItemQuantityByProductCode(String productCode, int availableQuantity) {
		return false;
	}
}
