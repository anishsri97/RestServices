package com.example.RestServices.exceptionHandling;

public class userNotFoundException  extends Exception
{

	private static final long serialVersionUID=1L;
	
	
	public userNotFoundException(String message)
	{
		super(message);
	}
}
