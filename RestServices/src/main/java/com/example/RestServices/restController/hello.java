package com.example.RestServices.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestServices.user.userDetails;





@RestController
public class hello 
{
    @Autowired
	//private userDetails user;
	//
   @GetMapping("/hello")
   public String hello()
   {
	   return "hello- world";
   }
   
   @GetMapping("/details")
   public userDetails get()
   {
	   userDetails user = new userDetails("Anish","xyz@mail.com","9797526522");
	   return user;
   }
}
