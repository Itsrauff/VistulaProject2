package com.example.project2.product.support;

import com.example.project2.product.support.Exception.ProductNotFoundException;

import java.util.function.Supplier;

public class ProductExceptionSupplier {
    public static Supplier<ProductNotFoundException> ProductNotFoundExceptionSupplier(Long id) {
        return () -> new ProductNotFoundException(id);
    }
}
