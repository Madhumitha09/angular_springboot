package com.luv2code.ecommerce.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.luv2code.ecommerce.entity.Product;

@CrossOrigin("http://localhost:57249/")
public interface ProductRepository extends JpaRepository<Product,Long> {
}
