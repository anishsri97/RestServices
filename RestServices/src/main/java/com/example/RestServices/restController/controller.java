package com.example.RestServices.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.RestServices.entity.entity;
import com.example.RestServices.exceptionHandling.userExistInDataBase;
import com.example.RestServices.exceptionHandling.userNotFoundException;
import com.example.RestServices.restServiceLayer.restService;

@RestController
public class controller 
{
   @Autowired
   private restService service;
   
   //GET_ALL
   @GetMapping("/findAll")
   public List<entity> findAll()
   {
	   return this.service.findall();
   }
   
   
   
   //GET BU ID
   @GetMapping("/findById/{id}")
   public Optional<entity> getById(@PathVariable long id )
   {
	  Optional<entity> ent=null;
	   
	   try {
	   
	   return  this.service.findById(id);
	   }
	   catch(userNotFoundException ex)
	   {
		   throw new ResponseStatusException(HttpStatus.NOT_FOUND,ex.getMessage());
	   }
	   
   }
   
   
   
   //POST
   @PostMapping("/add")
   public void addUser(@RequestBody entity ent)
   {
	   
	   try {
	   ent.setId(0);
	   this.service.save(ent);}catch(userExistInDataBase ex)
	   {
		   throw new ResponseStatusException(HttpStatus.BAD_REQUEST,ex.getMessage());
	   }
   }
   
   //PUT
   @PutMapping("/update")
   public void update(@RequestBody entity ent)
   {
	  try { this.service.update(ent);}
	  catch(Exception ex)
	  {
		  throw new ResponseStatusException(HttpStatus.BAD_REQUEST,ex.getMessage()); 
	  }
   }
   
   //DELETE
   @DeleteMapping("/deleteUser/{id}")
   public void deleteuser(@PathVariable long id)
   {
	   try {
	   this.service.deletebyId(id);}catch(userNotFoundException ex)
	   {
		   throw new ResponseStatusException(HttpStatus.BAD_REQUEST,ex.getMessage());
	   }
   }
   
   
   //custom methods
   @GetMapping("/findByName/{firstName}")
   public entity findByName(@PathVariable String firstName)
   {
	   
	   try {
	   return service.findByfirstName(firstName);
	   }
	   catch(userNotFoundException ex)
	   {
		   throw new ResponseStatusException(HttpStatus.BAD_REQUEST,ex.getMessage());
	   }
   }
  
   
   
   
}
