package com.robertmarinescu.crudapiaws.service;

import com.robertmarinescu.crudapiaws.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    private ProductRepository productRepository;
}
