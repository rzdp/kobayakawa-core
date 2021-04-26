package com.rzdp.kobayakawa.core.service.product;

import com.rzdp.kobayakawa.core.entity.Product;

import java.util.List;

public interface GetProductsByCategoryService {

    List<Product> execute(String category);
}
