package com.school.exam2.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double budget;

    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees;

    // Getters and Setters
}
