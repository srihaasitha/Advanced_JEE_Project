package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	public List<Order> findByOrderId(int orderId);
	public List<Order> findByCustomerName(String customerName);
}
