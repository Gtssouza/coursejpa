package com.gtssouza.coursejpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtssouza.coursejpa.entities.User;
import com.gtssouza.coursejpa.repositories.UserRepository;
import com.gtssouza.coursejpa.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
    public User findById(Long id) {
    	Optional<User> obj = repository.findById(id);
    	return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
    
    public User insert(User obj) {
    	return repository.save(obj);
    }
    
    public void delete(Long id) {
    	repository.deleteById(id);
    }
    
    /*Atualiza Usuario*/
    public User update(Long id, User obj) {
    	User entity = repository.getOne(id);
    	updateData(entity, obj);
    	return repository.save(entity);
    }

    /*Metodo para atualizar Usuario*/
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}

}
