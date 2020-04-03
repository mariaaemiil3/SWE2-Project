package com.example.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class AppController {
	
	@Autowired
	private UserService service ; 
	@RequestMapping("/ListofUsers")
	public String viewHomepage(Model modal) 
	{
		List<User> listusers =  service.listall() ; 
	    modal.addAttribute("list of Users : ", listusers) ; 
		return "index" ; 
	}
	@RequestMapping("/Signup")
	public String signup(Model modal) 
	{
		User user = new User() ; 
		modal.addAttribute("user" , user ); 
		return "NewUser" ; 
	}
	@RequestMapping(value = "/Signup", method = RequestMethod.POST)
	public String saveuser(@ModelAttribute("user") User user) {
	    service.save(user);
	     
	    return "redirect:/";
	}
	@RequestMapping("/login")
	public String login(Model modal) 
	{
		User user = new User() ; 
		modal.addAttribute("user" , user ); 
		return "login" ; 
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginforuser(@ModelAttribute("user") User user) {
	    service.save(user);
	     
	    return "redirect:/";
	}

}
