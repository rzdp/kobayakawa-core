package com.rzdp.kobayakawa.core.service.product.impl;

import com.rzdp.kobayakawa.core.entity.Product;
import com.rzdp.kobayakawa.core.repository.ProductRepository;
import com.rzdp.kobayakawa.core.service.product.GetProductsByCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class GetProductsByCategoryServiceImpl implements GetProductsByCategoryService {

    private final ProductRepository productRepository;

    @Autowired
    public GetProductsByCategoryServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> execute(String category) {
        return productRepository.findByCategory_Name(category);
    }
}
