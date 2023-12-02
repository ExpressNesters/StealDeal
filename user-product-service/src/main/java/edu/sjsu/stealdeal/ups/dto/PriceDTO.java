package edu.sjsu.stealdeal.ups.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PriceDTO {
    private double price;
    private LocalDateTime priceRecordTime;
}
