package com.example.project2.product.support;

import com.example.project2.product.api.Request.ProductRequest;
import com.example.project2.product.api.Request.UpdateProductRequest;
import com.example.project2.product.api.Response.ProductResponse;
import com.example.project2.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }
    public Product toProduct(Product product, UpdateProductRequest updateProductRequest) {
        product.setName(updateProductRequest.getName());
        return product;
    }
    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(),product.getName());
    }
}
