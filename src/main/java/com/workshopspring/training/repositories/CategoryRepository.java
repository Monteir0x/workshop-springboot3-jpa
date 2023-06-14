package com.workshopspring.training.repositories;

import com.workshopspring.training.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
