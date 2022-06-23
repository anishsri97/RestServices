package com.example.RestServices.restServiceLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestServices.entity.entity;
import com.example.RestServices.restReposiotry.userReposiotry;


@Service 
public class restServiceIMP implements restService {

	@Autowired
	private userReposiotry user;
	
	
	@Override
	public List<entity> findall() {
		
		return this.user.findAll();
	}

	@Override
	public Optional<entity> findById(long id) {
	
		return this.user.findById(id);
	}

	@Override
	public void save(entity ent) {
		this.user.save(ent);

	}

	@Override
	public void update(entity ent) {
		this.user.save(ent);

	}

	@Override
	public void deletebyId(long id) {
		this.user.deleteById(id);

	}
	
	
	@Override
	public entity findByfirstName(String firstName)
	{
		return this.user.findByfirstName(firstName);
	}

}
