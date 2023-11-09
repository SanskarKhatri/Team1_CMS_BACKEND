package com.ims.inventory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

	private static Logger LOGGER = LoggerFactory.getLogger(InventoryController.class);
	
	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private InventoryRepository invRepo;
	
	@GetMapping("/inventory")
	public ResponseEntity<?> findAll() {
		LOGGER.info("findAll");
		Map<String, List<Inventory>> rs = new HashMap<>();
		rs.put("inventory", invRepo.findAll());
		return ResponseEntity.ok().body(rs);
	}
}
