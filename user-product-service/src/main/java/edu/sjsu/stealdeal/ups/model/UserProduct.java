package edu.sjsu.stealdeal.ups.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user_products")
public class UserProduct {

    private String userProductId;
    private String userId;
    private String productId;
    private String createdAt;
    private String deletedAt;
}
