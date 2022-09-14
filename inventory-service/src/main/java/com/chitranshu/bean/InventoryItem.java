package com.chitranshu.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InventoryItem {
	@Id
	private Long id;
    private String productCode;
    private Integer availableQuantity ;
}
