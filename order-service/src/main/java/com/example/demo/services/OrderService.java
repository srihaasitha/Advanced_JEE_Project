package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.repos.OrderRepository;


@Service
public class OrderService {
	@Autowired
	private OrderRepository repo;
	public Order save(Order entity) {
		return this.repo.save(entity);
	}
	public List<Order> findAll() {
		return this.repo.findAll();
	}
	public List<Order> findByOrderId(int id) {
		return this.repo.findByOrderId(id);
	}
	public Order update(Order entity) {
		return this.repo.save(entity);
	}
	public List<Order> findByCustomerName(String customerName) {
		return this.repo.findByCustomerName(customerName);
	}
	
	
}
