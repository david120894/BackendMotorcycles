package com.example.Store.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="cycles")
public class Motorcycles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long motorCyclesId;

    private String brand;

    private String model;

    private String year;

    private Double price;
}
