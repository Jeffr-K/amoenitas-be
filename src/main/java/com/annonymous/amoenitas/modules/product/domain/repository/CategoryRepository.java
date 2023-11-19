package com.annonymous.amoenitas.modules.product.domain.repository;

import com.annonymous.amoenitas.modules.product.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
