package com.julio.SBProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julio.SBProject.entites.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	// Faz o CRUD para a classe User automaticamente.
}
