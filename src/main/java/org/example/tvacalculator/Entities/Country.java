package org.example.tvacalculator.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Country {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Long id ;

    @Column(unique=true, nullable=false)
    String name ;


}
