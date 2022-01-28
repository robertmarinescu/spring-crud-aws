package com.robertmarinescu.crudapiaws.service;

import com.robertmarinescu.crudapiaws.model.Product;
import com.robertmarinescu.crudapiaws.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.RuntimeErrorException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Product getProduct(long productId) {
        return productRepository.findById(productId).orElseThrow(() -> new RuntimeException("not found"));
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product updateProduct(long productId, Product product) {
        Product existingProduct = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("not found"));
        existingProduct.setProductName(product.getProductName());
        existingProduct.setColor(product.getColor());
        existingProduct.setPrice(product.getPrice());
        productRepository.save(existingProduct);
        return existingProduct;
    }

    public Product deleteProduct(long productId) {
        Product existingProduct = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("not found"));
        productRepository.delete(existingProduct);
        return existingProduct;
    }


    public List<Product> getProductsByName(String productName) {
        return productRepository.getProductsByName(productName);
    }
}
