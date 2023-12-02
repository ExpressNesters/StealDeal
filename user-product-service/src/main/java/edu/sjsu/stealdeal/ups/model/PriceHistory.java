package edu.sjsu.stealdeal.ups.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "price_history")
public class PriceHistory {

    private String priceHistoryId;
    private String price;
    private LocalDateTime priceRecordTime;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
}
