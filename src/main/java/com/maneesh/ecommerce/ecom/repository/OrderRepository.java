package com.maneesh.ecommerce.ecom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.maneesh.ecommerce.ecom.entity.OrderDetails;

@Component
@Repository
public interface OrderRepository extends CrudRepository<OrderDetails, Integer> {

}
