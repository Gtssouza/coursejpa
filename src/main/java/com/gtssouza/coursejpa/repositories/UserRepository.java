package com.gtssouza.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtssouza.coursejpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
		
	

}
