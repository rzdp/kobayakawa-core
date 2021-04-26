package com.rzdp.kobayakawa.core.repository;

import com.rzdp.kobayakawa.core.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory_Name(String category);

}
