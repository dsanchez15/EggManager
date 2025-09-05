package com.eggmanager.entity;

import com.eggmanager.dto.CustomerRequest;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    // Todo: Pendiente mejorar.
    public void update(CustomerRequest customerRequest) {
        this.name = customerRequest.getName();
    }
}
