package com.gtssouza.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtssouza.coursejpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
		
	

}
