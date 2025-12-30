package com.example.project2.product.api.Request;

public class ProductRequest {
    private final String name;

    public ProductRequest(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
