package com.example.inventorymanagementservice.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.stereotype.Service;

import java.util.Date;

@MappedSuperclass //No table will be created for child classes
@Getter
@Setter
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //TODO Learn different types of Identity
    Long id;
    @CreatedDate
    Date createdAt;
    @LastModifiedBy
    Date ModifiedAt;
    @Column(name = "is_deleted", columnDefinition = "BOOLEAN DEFAULT false")
    Boolean isDeleted; //Not required now ctually
}
