package com.flpoliveira.inventory.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.flpoliveira.inventory.entities.Accessory;
import com.flpoliveira.inventory.repositories.AccessoryRepository;

@Configuration
@Profile("test")

public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private AccessoryRepository accessoryRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Accessory a1 = new Accessory();
		Accessory a2 = new Accessory();
		
		accessoryRepository.saveAll(Arrays.asList(a1,a2));
		
	}

	
}
