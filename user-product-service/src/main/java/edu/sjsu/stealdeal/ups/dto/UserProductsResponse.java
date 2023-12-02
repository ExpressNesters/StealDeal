package edu.sjsu.stealdeal.ups.dto;

import java.util.List;

public class UserProductsResponse {

    private List<UserProductDTO> userProducts;
    private int currentPage;
    private long totalItems;
    private int totalPages;
    private int pageSize;
}
