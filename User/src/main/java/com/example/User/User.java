package com.example.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	private String id ; 
	private String name ;
	private Long email ; 
	private String password ; 
	private String gender ; 
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		name = name;
	}



	public Long getEmail() {
		return email;
	}



	public void setEmail(String email) {
		email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		password = password;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public enum Gender {
	    MALE, FEMALE
	}

}
