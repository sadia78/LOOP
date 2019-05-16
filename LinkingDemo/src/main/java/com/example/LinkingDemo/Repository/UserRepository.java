package com.example.LinkingDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LinkingDemo.Entity.UserRegistration;

public interface UserRepository extends JpaRepository< UserRegistration, Long> {

}
