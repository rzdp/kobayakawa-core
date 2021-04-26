package com.rzdp.kobayakawa.core.service.category.impl;

import com.rzdp.kobayakawa.core.entity.Category;
import com.rzdp.kobayakawa.core.repository.CategoryRepository;
import com.rzdp.kobayakawa.core.service.category.GetCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class GetCategoriesServiceImpl implements GetCategoriesService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public GetCategoriesServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> execute() {
        return categoryRepository.findAll();
    }
}
