package com.flpoliveira.inventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flpoliveira.inventory.entities.Accessory;

public interface AccessoryRepository extends JpaRepository<Accessory, Long>{

}
