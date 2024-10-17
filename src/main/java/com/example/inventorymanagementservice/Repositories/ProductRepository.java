package com.example.inventorymanagementservice.Repositories;

import com.example.inventorymanagementservice.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
