package com.maneesh.ecommerce.ecom.daointerface;

import com.maneesh.ecommerce.ecom.entity.Customer;

public interface CustomerDAO  {

	public void create(Customer customer);
	public Customer getCustomer(String username);
	
	
}
