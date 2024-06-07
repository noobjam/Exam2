package com.school.exam2.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ElementCollection(targetClass = Skill.class)
    @Enumerated(EnumType.STRING)
    private Set<Skill> skills;

    @Enumerated(EnumType.STRING)
    private Post post;

    @ManyToMany
    @JoinTable(
            name = "employee_project",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private Set<Project> projects;

    // Getters and Setters
}

