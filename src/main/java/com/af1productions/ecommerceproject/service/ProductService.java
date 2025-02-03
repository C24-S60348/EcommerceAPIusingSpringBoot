package com.af1productions.ecommerceproject.service;

import com.af1productions.ecommerceproject.model.Product;
import com.af1productions.ecommerceproject.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@Service
public class ProductService
{
    @Autowired
    private ProductRepo repo;

    //GET all products
    public List<Product> getAllProducts()
    {
        return repo.findAll();
    }

    //GET product id
    public Product getProductById(int id)
    {
        return repo.findById(id).orElse(null);
    }

    //POST add product
    public Product addProduct(Product product) 
    {
        return repo.save(product);
    }

    //PUT update product
    public Product updateProduct(int id, Product product)
    {
        return repo.save(product);
    }

    //DELETE product
    public void deleteProduct(int id)
    {
        repo.deleteById(id);
    }

    





}

