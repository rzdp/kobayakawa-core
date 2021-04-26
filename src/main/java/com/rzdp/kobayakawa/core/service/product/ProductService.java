package com.rzdp.kobayakawa.core.service.product;

import com.rzdp.kobayakawa.core.model.common.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getProducts();

    List<ProductDto> getProductsByCategory(String category);

}
