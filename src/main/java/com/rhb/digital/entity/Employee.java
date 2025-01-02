package com.rhb.digital.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String position;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
