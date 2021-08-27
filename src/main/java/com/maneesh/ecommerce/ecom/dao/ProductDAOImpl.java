package com.maneesh.ecommerce.ecom.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maneesh.ecommerce.ecom.daointerface.ProductDAO;
import com.maneesh.ecommerce.ecom.entity.Product;
import com.maneesh.ecommerce.ecom.repository.ProductRepository;

@Component
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	ProductRepository repo;
	
	
	public void create(Product product) {
		repo.save(product);
	}


	public List<Product> getProducts(int i) {
		// TODO Auto-generated method stub
		List<Product> result = new ArrayList<Product>();
		List<Product> products = (List<Product>) repo.findAll();
		for(Product product : products) {
			if(product.getCategoryId() == i) {
				result.add(product);
			}
		}
		return result;
	}

}
