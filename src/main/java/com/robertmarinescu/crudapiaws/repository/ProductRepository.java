package com.robertmarinescu.crudapiaws.repository;

import com.robertmarinescu.crudapiaws.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
