package com.example.RestServices.restServiceLayer;

import java.util.List;
import java.util.Optional;

import com.example.RestServices.entity.entity;
import com.example.RestServices.exceptionHandling.userExistInDataBase;
import com.example.RestServices.exceptionHandling.userNotFoundException;

public interface restService 
{
   
	//get all-GET
	public List<entity> findall();
	
	//get by id - GET
	public Optional<entity> findById(long id)throws userNotFoundException;
	
	
	//post add
	public void save(entity ent)throws userExistInDataBase;
	
	//update - PUT method
	
	public void update(entity ent)throws userNotFoundException;
	
	//delete -DELETE
	public void deletebyId(long id)throws userNotFoundException;;
	
	//find by name
	
	public entity findByfirstName(String firstName)throws userNotFoundException;
}
