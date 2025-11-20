package org.example.tvacalculator.Repositories;

import org.example.tvacalculator.Entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
