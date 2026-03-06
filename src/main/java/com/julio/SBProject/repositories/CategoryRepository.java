package com.julio.SBProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julio.SBProject.entites.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	// Faz o CRUD para a classe User automaticamente.
}
