package com.eggmanager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private boolean isCanasta;

    @Column
    private Integer cantidad;

    @Column
    private Integer customer;

    @Column
    private Long precio;
}
