package com.school.exam2.entities;


import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private Post name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    // Getters and Setters
}
