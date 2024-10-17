package com.example.inventorymanagementservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Category extends BaseModel{
    String name ;
    @OneToMany(mappedBy = "category")
    List<Product> products;

}
