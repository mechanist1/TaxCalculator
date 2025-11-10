package org.example.tvacalculator.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(unique=false, nullable=false)
    String name;


}
