package com.workshopspring.training.repositories;

import com.workshopspring.training.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
