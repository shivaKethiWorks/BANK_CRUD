package com.controller;

import com.entity.Product;
import com.service.ProductService;

import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;
    
    @GetMapping("/hello")
    public String greetHello() {
    	return "Hello World";
    }
    
    @PostMapping("/addProduct")
    @ApiOperation(value = "Add a single product")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    @ApiOperation(value = "Add Multiple products")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    @ApiOperation(value = "Show all products")
	public List<Product> findAllProducts() { 
    	return service.getProducts(); 
    	}

    
    @GetMapping("/productById/{id}")
    @ApiOperation(value = "Show a single product by id")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    @ApiOperation(value = "Show a single product by name")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Delete a single product by id")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
