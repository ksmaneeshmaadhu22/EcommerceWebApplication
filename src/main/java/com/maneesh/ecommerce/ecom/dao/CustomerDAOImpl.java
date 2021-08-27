package com.maneesh.ecommerce.ecom.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maneesh.ecommerce.ecom.daointerface.CustomerDAO;
import com.maneesh.ecommerce.ecom.entity.Customer;
import com.maneesh.ecommerce.ecom.repository.CustomerRepository;

@Component
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	CustomerRepository repo;

	@Override
	public void create(Customer customer) {
		repo.save(customer);
	}

	@Override
	public Customer getCustomer(String username) {
		Optional<Customer> customer = repo.findById(username);
		if(customer.isPresent()) {
			return customer.get();
		} else {
			return null;
		}
	}

	
}
