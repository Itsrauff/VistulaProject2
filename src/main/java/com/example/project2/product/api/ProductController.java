package com.example.project2.product.api;

import com.example.project2.product.api.Request.ProductRequest;
import com.example.project2.product.api.Request.UpdateProductRequest;
import com.example.project2.product.api.Response.ProductResponse;
import com.example.project2.product.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest) {
        ProductResponse productResponse = productService.create(productRequest);
        return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    @Operation(summary = "Find Product By Id")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable("id") Long id) {
        ProductResponse pr = productService.find(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(pr);
    }

    @PutMapping("{id}")
    @Operation(summary = "Update Product By ID")
    public ResponseEntity<ProductResponse> updateProductById(@PathVariable("id") Long id, @RequestBody UpdateProductRequest updateProductRequest) {
        ProductResponse productResponse = productService.update(id, updateProductRequest);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }
    @GetMapping
    @Operation(summary = "Get All Products")
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        List<ProductResponse> productResponse = productService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }
    @DeleteMapping("/{id}")
    @Operation(summary = "Delete Product")
    public ResponseEntity<Void> deleteProductById(@PathVariable("id") Long id) {
        productService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
