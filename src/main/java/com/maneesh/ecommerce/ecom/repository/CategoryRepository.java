package com.maneesh.ecommerce.ecom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.maneesh.ecommerce.ecom.entity.Category;

@Component
@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {

}
