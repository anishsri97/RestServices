package com.example.RestServices.exceptionHandling;




public class userExistInDataBase extends Exception
{
   private static final long serialversionUID=1l;
   
   public userExistInDataBase(String message)
   {
	   super(message);
   }
}
