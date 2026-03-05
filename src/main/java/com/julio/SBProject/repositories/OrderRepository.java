package com.julio.SBProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julio.SBProject.entites.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	// Faz o CRUD para a classe User automaticamente.
}
