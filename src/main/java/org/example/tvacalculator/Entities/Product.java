package org.example.tvacalculator.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(unique=false, nullable=false)
    String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "origin_country_id", nullable = false)
    private Country originCountry;

}
