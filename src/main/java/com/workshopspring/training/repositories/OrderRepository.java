package com.workshopspring.training.repositories;

import com.workshopspring.training.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
