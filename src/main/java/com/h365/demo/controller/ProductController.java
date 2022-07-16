package com.h365.demo.controller;

import java.util.Map;
import java.util.UUID;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/products")
public class ProductController {
    public ProductController() {

    }

    @GetMapping
    public ResponseEntity getProducts(@PageableDefault(size = 20) Pageable pageable) {
        return ResponseEntity.ok(Map.of("id", UUID.randomUUID().toString()));
    }
}
