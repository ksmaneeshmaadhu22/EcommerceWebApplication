package com.maneesh.ecommerce.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maneesh.ecommerce.ecom.dao.CategoryDAOImpl;
import com.maneesh.ecommerce.ecom.dao.ProductDAOImpl;
import com.maneesh.ecommerce.ecom.entity.Category;
import com.maneesh.ecommerce.ecom.entity.Product;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAOImpl dao;
	
	@Autowired
	CategoryDAOImpl dao1;
	
	@GetMapping("/product")
	public String create() {
	return "product";
	}
	
	@PostMapping("/product")
	public String createProduct(@RequestParam("name") String name, @RequestParam("desc") String desc, @RequestParam("price") int price) {
		dao.create(new Product(name,desc,price));
		return "product";
	}
	
	@GetMapping("/mobile")
	public String getMobiles(ModelMap model) {
		List<Category> categories = dao1.getAllCategory();
		List<Product> products = dao.getProducts(1);
		model.put("name", categories);
		model.put("product", products);
		return "mobile";
		
	}
	
	@GetMapping("/laptop")
	public String getLaptop(ModelMap model) {
		List<Category> categories = dao1.getAllCategory();
		List<Product> products = dao.getProducts(2);
		model.put("name", categories);
		model.put("product", products);
		return "laptop";
		
	}
	
	@GetMapping("/furniture")
	public String getFurniture(ModelMap model) {
		List<Category> categories = dao1.getAllCategory();
		List<Product> products = dao.getProducts(3);
		model.put("name", categories);
		model.put("product", products);
		return "furniture";
		
	}
	
	@GetMapping("/ac")
	public String getAc(ModelMap model) {
		List<Category> categories = dao1.getAllCategory();
		List<Product> products = dao.getProducts(4);
		model.put("name", categories);
		model.put("product", products);
		return "ac";
		
	}
	
	@GetMapping("/toys")
	public String getToys(ModelMap model) {
		List<Category> categories = dao1.getAllCategory();
		List<Product> products = dao.getProducts(5);
		model.put("name", categories);
		model.put("product", products);
		return "toys";
		
	}

}
