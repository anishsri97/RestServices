package com.example.RestServices.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestServices.entity.entity;
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
	   return this.service.findById(id);
   }
   //POST
   @PostMapping("/add")
   public void addUser(@RequestBody entity ent)
   {
	   ent.setId(0);
	   this.service.save(ent);
   }
   //PUT
   @PutMapping("/update")
   public void update(@RequestBody entity ent)
   {
	   this.service.save(ent);
   }
   
   //DELETE
   @DeleteMapping("/deleteUser/{id}")
   public void deleteuser(@PathVariable long id)
   {
	   this.service.deletebyId(id);
   }
   
   @GetMapping("/findByName/{firstName}")
   public entity findByName(@PathVariable String firstName)
   {
	   return service.findByfirstName(firstName);
   }
  
   
   
   
}
