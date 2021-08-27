package com.maneesh.ecommerce.ecom.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maneesh.ecommerce.ecom.daointerface.OrderDAO;
import com.maneesh.ecommerce.ecom.entity.OrderDetails;
import com.maneesh.ecommerce.ecom.repository.OrderRepository;

@Component
public class OrderDAOImpl implements OrderDAO {
	
	@Autowired
	OrderRepository repo;

	@Override
	public void createOrder(OrderDetails order) {
	repo.save(order);
	}

}
