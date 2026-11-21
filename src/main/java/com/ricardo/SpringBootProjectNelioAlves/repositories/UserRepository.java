package com.ricardo.SpringBootProjectNelioAlves.repositories;


import com.ricardo.SpringBootProjectNelioAlves.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
