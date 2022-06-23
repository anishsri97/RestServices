package com.example.RestServices.restServiceLayer;

import java.util.List;
import java.util.Optional;

import com.example.RestServices.entity.entity;

public interface restService 
{
   
	//get all-GET
	public List<entity> findall();
	
	//get by id - GET
	public Optional<entity> findById(long id);
	
	
	//post add
	public void save(entity ent);
	
	//update - PUT method
	
	public void update(entity ent);
	
	//delete -DELETE
	public void deletebyId(long id);
	
	//find by name
	
	public entity findByfirstName(String firstName);
}
