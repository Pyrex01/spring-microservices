package com.microservice.productService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProductServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }


    @GetMapping("/product-hello")
    String hello() {
        return "hello from productService";
    }

}
