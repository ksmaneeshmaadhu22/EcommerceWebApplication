package com.maneesh.ecommerce.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maneesh.ecommerce.ecom.dao.CategoryDAOImpl;
import com.maneesh.ecommerce.ecom.entity.Category;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAOImpl dao;

	@GetMapping("/category")
	public String Category(ModelMap model) {
		List<Category> categories = dao.getAllCategory();
		model.put("category", categories);
		return "category";
	}

	@PostMapping("/category")
	public String createCategory(@RequestParam("name") String name, @RequestParam("desc") String desc) {
		dao.create(new Category(name, desc));
		return "category";
	}
}
