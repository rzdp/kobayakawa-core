package com.rzdp.kobayakawa.core.service.product.impl;

import com.rzdp.kobayakawa.core.entity.Product;
import com.rzdp.kobayakawa.core.repository.ProductRepository;
import com.rzdp.kobayakawa.core.service.product.GetProductsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class GetProductsServiceImpl implements GetProductsService {

    private final ProductRepository productRepository;

    public GetProductsServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> execute() {
        return productRepository.findAll();
    }
}
