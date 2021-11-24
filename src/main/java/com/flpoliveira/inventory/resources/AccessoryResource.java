package com.flpoliveira.inventory.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flpoliveira.inventory.entities.Accessory;

@RestController
@RequestMapping(value = "/accessories")
public class AccessoryResource {

	@GetMapping
	public ResponseEntity<Accessory> findAll() {
		
		Accessory a = new Accessory();
			
		
		return ResponseEntity.ok().body(a);
		
	}
	
}
