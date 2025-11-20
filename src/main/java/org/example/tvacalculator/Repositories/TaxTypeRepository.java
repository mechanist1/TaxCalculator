package org.example.tvacalculator.Repositories;

import org.example.tvacalculator.Entities.TaxType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxTypeRepository extends JpaRepository<TaxType, Long> {
}
