package com.example.inventorymanagementservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem extends BaseModel{
    @OneToOne
    private Product product;
    private Double price;
    private Integer quantity;
    private Double totalPrice;
    @ManyToOne
    private Order order;
}
