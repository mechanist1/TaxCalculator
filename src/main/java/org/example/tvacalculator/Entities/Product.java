package org.example.tvacalculator.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(unique=false, nullable=true)
    String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = true)
    private ProductCategory category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "origin_country_id", nullable = true)
    private Country originCountry;

}
