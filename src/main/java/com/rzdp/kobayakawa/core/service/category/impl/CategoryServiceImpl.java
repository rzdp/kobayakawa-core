package com.rzdp.kobayakawa.core.service.category.impl;

import com.rzdp.kobayakawa.core.entity.Category;
import com.rzdp.kobayakawa.core.model.common.CategoryDto;
import com.rzdp.kobayakawa.core.service.category.CategoryService;
import com.rzdp.kobayakawa.core.service.category.GetCategoriesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class CategoryServiceImpl implements CategoryService {

    private final GetCategoriesService getCategoriesService;
    private final ModelMapper modelMapper;

    @Autowired
    public CategoryServiceImpl(GetCategoriesService getCategoriesService,
                               ModelMapper modelMapper) {
        this.getCategoriesService = getCategoriesService;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CategoryDto> getCategories() {
        return getCategoriesService.execute().stream()
                .map(category -> modelMapper.map(category, CategoryDto.class))
                .collect(Collectors.toList());
    }
}
