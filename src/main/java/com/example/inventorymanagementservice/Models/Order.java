package com.example.inventorymanagementservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Order_Table")
public class Order extends BaseModel{
    Double orderTotal;
    Integer countOfItems;
    @OneToMany(mappedBy = "order")
    List<OrderItem> items;
}
