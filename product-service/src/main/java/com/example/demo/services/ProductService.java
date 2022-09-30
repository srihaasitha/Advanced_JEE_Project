package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;


@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	public Product save(Product entity) {
		return this.repo.save(entity);
	}
	public List<Product> findAll() {
		return this.repo.findAll();
	}
	public List<Product> findByMerchantName(String merchantName) {
		return this.repo.findByMerchantName(merchantName);
	}
	public List<Product> findByAvailability(){
		return this.repo.findByAvailability();
	}
	public List<Product> findZeroAvailability(){
		return this.repo.findZeroAvailability();
	}
	public Product update(Product entity) {
		return this.repo.save(entity);
	}
	
}
