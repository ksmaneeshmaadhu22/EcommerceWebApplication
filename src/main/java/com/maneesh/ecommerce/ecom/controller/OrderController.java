package com.maneesh.ecommerce.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maneesh.ecommerce.ecom.dao.OrderDAOImpl;
import com.maneesh.ecommerce.ecom.entity.OrderDetails;

@Controller
public class OrderController {

	@Autowired
	OrderDAOImpl dao;

	@GetMapping("/order")
	public String getOrder() {
		return "redirect:order";
	}

	@GetMapping("/success")
	public String success(@RequestParam("name") String name, @RequestParam("price") int price) {
		dao.createOrder(new OrderDetails(name, price));
		return "success";
	}
}
