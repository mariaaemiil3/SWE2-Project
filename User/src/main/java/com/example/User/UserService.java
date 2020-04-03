package com.example.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository rep ;
	public List<User> listall() {
		return rep.findAll() ; 
	} 
	public void save (User user)
	{
		rep.save(user) ; 
	}
	public User get(Long id)
	{
		return rep.findById(id).get() ; 
		
	}
	public void delete(Long id) 
	{
		rep.deleteById(id);
	}

}
