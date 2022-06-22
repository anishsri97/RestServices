package com.example.RestServices.user;



public class userDetails 
{
    @Override
	public String toString() {
		return "userDetails [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	private String name;
    private String email;
    private String phone;
    
    
    
    
    
    // getters and setters
	public String getName() {
		return name;
	}
	
	// parametrized constructor
	public userDetails(String name, String email, String phone) {
		//super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    
    
}
