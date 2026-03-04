package com.julio.SBProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julio.SBProject.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {
	// Faz o CRUD para a classe User automaticamente.
}
