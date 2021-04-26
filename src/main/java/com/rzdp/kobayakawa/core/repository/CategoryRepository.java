package com.rzdp.kobayakawa.core.repository;

import com.rzdp.kobayakawa.core.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
