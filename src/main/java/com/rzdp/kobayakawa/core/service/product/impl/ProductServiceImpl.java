package com.rzdp.kobayakawa.core.service.product.impl;

import com.rzdp.kobayakawa.core.model.common.ProductDto;
import com.rzdp.kobayakawa.core.service.product.GetProductsByCategoryService;
import com.rzdp.kobayakawa.core.service.product.GetProductsService;
import com.rzdp.kobayakawa.core.service.product.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class ProductServiceImpl implements ProductService {

    private final GetProductsService getProductsService;
    private final GetProductsByCategoryService getProductsByCategoryService;
    private final ModelMapper modelMapper;
    @Autowired
    public ProductServiceImpl(GetProductsService getProductsService,
                              GetProductsByCategoryService getProductsByCategoryService,
                              ModelMapper modelMapper) {
        this.getProductsService = getProductsService;
        this.getProductsByCategoryService = getProductsByCategoryService;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ProductDto> getProducts() {
        return getProductsService.execute().stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> getProductsByCategory(String category) {
        return getProductsByCategoryService.execute(category).stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .collect(Collectors.toList());
    }
}
