package com.gtssouza.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtssouza.coursejpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
		
	

}
