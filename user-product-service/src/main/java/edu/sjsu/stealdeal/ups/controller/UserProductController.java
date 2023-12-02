package edu.sjsu.stealdeal.ups.controller;

import com.amazonaws.services.s3.event.S3EventNotification;
import edu.sjsu.stealdeal.ups.dto.CreateUserProductRequest;
import edu.sjsu.stealdeal.ups.dto.PriceHistoryResponse;
import edu.sjsu.stealdeal.ups.dto.UserProductResponse;
import edu.sjsu.stealdeal.ups.dto.UserProductsResponse;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/user-products")
public class UserProductController {

    @GetMapping("/{userProductId}")
    public ResponseEntity<UserProductResponse> getUserProductById() {
        UserProductResponse userProductResponse = null;
        return ResponseEntity.ok(userProductResponse);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserProductsResponse> getUserProductsByUserId(@PathVariable String userId, Pageable page) {
        UserProductsResponse userProductsResponse = null;
        return ResponseEntity.ok(userProductsResponse);
    }

    @GetMapping("/user-products/{userProductId}/price-history")
    public ResponseEntity<PriceHistoryResponse> getPriceHistory() {
        PriceHistoryResponse priceHistoryResponse = null;
        return ResponseEntity.ok(priceHistoryResponse);
    }

    @PostMapping("/")
    public ResponseEntity<UserProductResponse> createUserProduct(@RequestBody CreateUserProductRequest userProductRequest) {
        UserProductResponse userProductResponse = null;
        URI location = URI.create("/user-products/" + userProductResponse.getUserProducts().getUserProductId());
     return ResponseEntity.created(location).body(userProductResponse);
    }

    @DeleteMapping("/{userProductId}")
    public ResponseEntity<Void> deleteUserProduct(@PathVariable String userProductId) {
        UserProductResponse userProductResponse = null;
        return ResponseEntity.noContent().build();
    }
}