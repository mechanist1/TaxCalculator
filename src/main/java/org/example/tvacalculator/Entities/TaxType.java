package org.example.tvacalculator.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TaxType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String code; // e.g. "TVA"

    @Column(nullable = false)
    private String description;
}
