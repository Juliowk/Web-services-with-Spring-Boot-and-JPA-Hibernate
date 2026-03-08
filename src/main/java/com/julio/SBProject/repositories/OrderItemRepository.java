package com.julio.SBProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julio.SBProject.entites.OrderItem;
import com.julio.SBProject.entites.pk.OrderItemPK;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	// Faz o CRUD para a classe User automaticamente.
}
