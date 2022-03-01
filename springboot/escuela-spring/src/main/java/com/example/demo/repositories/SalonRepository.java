package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.SalonModel;

// Pide identificar la entidad que vamos a estar conectando
// El tipo de dato de int es Integer
@Repository
public interface SalonRepository extends JpaRepository<SalonModel, Integer> {
	
}
