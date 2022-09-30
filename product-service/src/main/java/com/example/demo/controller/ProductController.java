package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping(path="/")
@AllArgsConstructor
@NoArgsConstructor
public class ProductController {
    
    @Autowired
    private ProductService service;
    
    @GetMapping("/list")
    public List<Product> findAll(){
        return this.service.findAll();
    }
    @GetMapping("/list/{merchantName}")
    public List<Product> findByProductMerchant(@PathVariable("merchantName") String productMerchant) {
        return this.service.findByMerchantName(productMerchant);
    }
    @GetMapping("/inventoryAvailable")
    public List<Product> findByAvailability(){
        return this.service.findByAvailability();
    }
    @GetMapping("/zeroInventory")
    public List<Product> findByNotAvailability(){
        return this.service.findZeroAvailability();
    }
    @PostMapping("/save")
    public ResponseEntity<Product> add(@RequestBody Product entity){
        Product addedObj=this.service.save(entity);
        return ResponseEntity.ok().body(null);
    }
    @PutMapping("/update")
    public ResponseEntity<Product> update(@RequestBody Product entity){
        Product addedObj=this.service.update(entity);
        return ResponseEntity.ok().body(null);
    }
}