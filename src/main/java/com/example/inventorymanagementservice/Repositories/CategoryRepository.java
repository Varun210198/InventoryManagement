package com.example.inventorymanagementservice.Repositories;

import com.example.inventorymanagementservice.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
