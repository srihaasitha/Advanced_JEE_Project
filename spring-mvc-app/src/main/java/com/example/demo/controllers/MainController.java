package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Product;

@Controller
public class MainController {
	
	@Autowired
	private RestTemplate template;
	
	public MainController() {
		super();
	}
	
	@GetMapping(path = "/")
	public String welcomePage() {
		return "index";
	}
	@RequestMapping("/products")
	public String goToProducts() {
		return "products";
	}
	@RequestMapping("/orders")
	public String goToOrders() {
		return "orders";
	}
	@RequestMapping("/save_product")
	public String saveProducts() {
		return "save_product";
	}
	@RequestMapping("/update_product")
	public String updateProducts() {
		return "update_product";
	}
	@RequestMapping("/merchant")
	public String searchBymerchant() {
		return "merchant";
	}
	@RequestMapping("/inventory")
	public String checkInventory() {
		return "inventory";
	}
	@RequestMapping("/product_list")
	public String displayProducts() {
		return "product_list";
	}
	@RequestMapping("/save_order")
	public String saveOrders() {
		return "save_order";
	}
	@RequestMapping("/update_order")
	public String updateOrders() {
		return "update_order";
	}
	@RequestMapping("/order_list")
	public String displayOrders() {
		return "order_list";
	}
	@RequestMapping("/order_id")
	public String searchByOrderId() {
		return "order_id";
	}
	
}

