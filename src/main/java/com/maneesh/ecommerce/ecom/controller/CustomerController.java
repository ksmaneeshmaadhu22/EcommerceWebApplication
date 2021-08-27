package com.maneesh.ecommerce.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maneesh.ecommerce.ecom.dao.CustomerDAOImpl;
import com.maneesh.ecommerce.ecom.entity.Customer;


@Controller
public class CustomerController {

	  @Autowired 
	  CustomerDAOImpl dao;
	  
	  
	  @GetMapping("/register") 
	  public String register() { 
		  return "register";
	  }
	  
	  @PostMapping("/register") 
	  public String registerCustomer(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("name") String name, @RequestParam("emailid") String emailid, @RequestParam("mobilenumber") String mobilenumber,@RequestParam("address") String address) { 
		  dao.create(new Customer(username,password,name,emailid,mobilenumber,address));
		  return "redirect:login";
	  }
	  
	  @GetMapping("/login")
	  public String login() { 
		  return "login";
	  }
	  
	  @PostMapping("/login")
	  public String loginCustomer(@RequestParam("username") String username, @RequestParam("password") String password, ModelMap model) {
		  Customer customer = dao.getCustomer(username);
		  if(customer!=null && password.equals(customer.getPassword())) {
			  return "redirect:category";
		  } else {
			  model.put("message", "Invalid Credentials");
			  return "login";
		  }
		  
	  }
	  
	 
}
