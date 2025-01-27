package com.Lordesate.email_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository for performing CRUD operations on the User entity
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Custom query method to find a user by email
    User findByEmail(String email);
}
