package com.example.RestServices.restReposiotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestServices.entity.entity;


@Repository
public interface userReposiotry extends JpaRepository<entity, Long> {

	
	public entity findByfirstName(String FIRST_NAME);
}
