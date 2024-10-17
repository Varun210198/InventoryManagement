package com.example.inventorymanagementservice.Repositories;

import com.example.inventorymanagementservice.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
