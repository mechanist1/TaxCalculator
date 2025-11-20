package org.example.tvacalculator.Repositories;

import org.example.tvacalculator.Entities.TaxRule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxRuleRepository extends JpaRepository<TaxRule, Long> {
}
