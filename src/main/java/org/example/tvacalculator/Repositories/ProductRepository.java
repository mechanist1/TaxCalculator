package org.example.tvacalculator.Repositories;

import org.example.tvacalculator.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
