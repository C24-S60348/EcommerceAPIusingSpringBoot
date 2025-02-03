package com.af1productions.ecommerceproject.repo;

import com.af1productions.ecommerceproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//JpaRepository< OBJECT , PRIMARY >
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>
{

}
