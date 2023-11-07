package com.annonymous.ttaleum.modules.product.domain.repository;

import com.annonymous.ttaleum.modules.product.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
