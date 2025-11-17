package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<String> getAllProducts() {
        return List.of("Laptop", "Mobile", "Tablet");
    }
}
