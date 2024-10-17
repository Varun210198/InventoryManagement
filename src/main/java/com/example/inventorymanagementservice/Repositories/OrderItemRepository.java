package com.example.inventorymanagementservice.Repositories;

import com.example.inventorymanagementservice.Models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
