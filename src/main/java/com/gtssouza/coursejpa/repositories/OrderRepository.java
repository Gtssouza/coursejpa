package com.gtssouza.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtssouza.coursejpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
		
	

}
