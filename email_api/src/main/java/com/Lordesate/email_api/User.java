package com.Lordesate.email_api;


import jakarta.persistence.*;

@Entity // Marks this class as a JPA entity
@Table(name = "\"users\"") // Maps this entity to the "user" table in the database
public class User {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate IDs
    private Long id;

    @Column(nullable = false) // Column is required (NOT NULL)
    private String name;

    @Column(nullable = false, unique = true) // Email must be unique and not null
    private String email;

    // Default constructor (required by JPA)
    public User() {}

    // Constructor for convenience (optional)
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}