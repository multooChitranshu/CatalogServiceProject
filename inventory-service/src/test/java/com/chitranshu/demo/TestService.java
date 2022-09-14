package com.chitranshu.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chitranshu.bean.InventoryItem;
import com.chitranshu.persistence.InventoryDao;
import com.chitranshu.service.InventoryServiceImpl;

@SpringBootTest
//@RunWith(MockitoJUnitRunner.class)
public class TestService {
	
	@Autowired
	@InjectMocks
	InventoryServiceImpl inventoryService;
	
	@Mock
	InventoryDao inventoryDao;
	
	private AutoCloseable closeable;
	
	@BeforeEach
	void setUp() throws Exception {
		closeable=MockitoAnnotations.openMocks(this);
	}

	@AfterEach
	void tearDown() throws Exception {
		closeable.close();
	}

	@Nested
	class TestFindByProductCode{
		@Test
		public void findByProductCode_T001() {
			InventoryItem expected=new InventoryItem((long)101, "P001", 217);
			
			Mockito.when(inventoryDao.findByProductCode("P001")).thenReturn(Arrays.asList(expected));
			
			assertEquals(expected, inventoryService.getInventoryItemByProductCode("P001"));
		}
		
		@Test
		public void findByProductCode_T002() {
			List<InventoryItem> emptyList=new ArrayList<>();
			Mockito.when(inventoryDao.findByProductCode("P099")).thenReturn(emptyList);
			
			InventoryItem expected=new InventoryItem();
			assertEquals(expected, inventoryService.getInventoryItemByProductCode("P099"));
		}
	}
	
	@Nested
	class TestUpdateInventoryItemQuantityByProductCode{
		@Test
		public void update_T001() {
			Mockito.when(inventoryDao.updateInventoryItemQuantityByProductCode("P001", 200)).thenReturn(1);
			
			assertTrue(inventoryService.updateInventoryItemQuantityByProductCode("P001", 200));
		}
		
		@Test
		public void update_T002() {
			Mockito.when(inventoryDao.updateInventoryItemQuantityByProductCode("P001", 0)).thenReturn(1);
			
			assertTrue(inventoryService.updateInventoryItemQuantityByProductCode("P001", 0));
		}
		
		//negative cases
		@Test
		public void update_T003() {
//			Mockito.when(inventoryDao.updateInventoryItemQuantityByProductCode("P001", -200)).thenReturn(0);
			
			assertFalse(inventoryService.updateInventoryItemQuantityByProductCode("P001", -200));
		}
		
		@Test
		public void update_T004() {
			Mockito.when(inventoryDao.updateInventoryItemQuantityByProductCode("P099", 200)).thenReturn(0);
			
			assertFalse(inventoryService.updateInventoryItemQuantityByProductCode("P099", 200));
		}
	}
}
