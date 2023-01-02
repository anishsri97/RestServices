package com.example.RestServices.restServiceLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestServices.entity.entity;
import com.example.RestServices.exceptionHandling.userExistInDataBase;
import com.example.RestServices.exceptionHandling.userNotFoundException;
import com.example.RestServices.restReposiotry.userReposiotry;

//hello anish srivastava
@Service
public class restServiceIMP implements restService {

	@Autowired
	private userReposiotry user;
	
	
	@Override
	public List<entity> findall() {
		
		return this.user.findAll();
	}

	@Override
	public Optional<entity> findById(long id) throws userNotFoundException 
	{
	
		Optional<entity> entity =  this.user.findById(id);
		if(!entity.isPresent())
		{
			throw new userNotFoundException("user not found in database");
		}
		return entity;
	}

	@Override
	public void save(entity ent) throws userExistInDataBase
	{
		
		String name = ent.getFirstName();
		if(user.findByfirstName(name)!=null)
		{
			throw new userExistInDataBase("this user name is already exist in database");
		}
		else
		{
			this.user.save(ent);
		}
		

	}

	@Override
	public void update(entity ent)throws userNotFoundException 
	{
		  entity en = user.findByfirstName(ent.getFirstName());
		  
		  if(en==null)
		  {
			  throw new  userNotFoundException("user is not present in database"); 
		  }
		  
		  else
		  {
			  this.user.save(ent);
		  }

	}

	@Override
	public void deletebyId(long id) throws userNotFoundException 
	{
		Optional<entity> u = this.user.findById(id);
		if(!u.isPresent())
		{
			throw new userNotFoundException("user doen't exist in database");
		}
		this.user.deleteById(id);

	}
	
	
	@Override
	public entity findByfirstName(String firstName)throws userNotFoundException 
	{
		entity et =this.user.findByfirstName(firstName);
		if(et==null)
		{
			throw new userNotFoundException(firstName+" is not found in database");
		}
		//System.out.println(et);
		return et;
		
		
	}

}
