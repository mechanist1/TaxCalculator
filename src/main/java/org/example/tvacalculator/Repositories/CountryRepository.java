package org.example.tvacalculator.Repositories;

import org.example.tvacalculator.Entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
