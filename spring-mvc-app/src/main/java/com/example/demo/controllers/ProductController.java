package com.example.demo.controllers;

import java.util.Date;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters.LocalDateConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Order;
import com.example.demo.entity.Product;



@Controller
public class ProductController {
	
	@Autowired
	private RestTemplate template;
	
	
	Product orderProduct;
	public ProductController() {
		super();
		
	}
	
	@GetMapping(path = "/product_list")
  public String getProducts(Model model) {
      model.addAttribute("list",template.getForObject("http://localhost:4041/list",Product[].class));
      
      return "product_list";
   }
	
	@PostMapping(path = "/save_product")
	  public String saveProducts(Model model ,@RequestParam int id,@RequestParam String productName,@RequestParam String merchantName,@RequestParam double amount,@RequestParam int inventory) {
	    Product newProduct= new Product(id,productName,amount,inventory,merchantName) ;
	    if(newProduct.getProductId()!=0) {
	         String message="One Product Added";
	         template.postForLocation("http://localhost:4041/save", newProduct,Product.class);
	         model.addAttribute("created",message);
	     }
		return "save_product";
	   }
	
     @GetMapping(path = "/update_product")
     public String updateProducts() {
   	  return "update_product";
     }
    @RequestMapping(path = "/update_product",method = RequestMethod.POST)
    public String updateProducts(Model model ,@RequestParam int id,@RequestParam String productName,@RequestParam String merchantName,@RequestParam double amount,@RequestParam int inventory) {
	    Product newProduct= new Product(id,productName,amount,inventory,merchantName) ;
	    if(newProduct.getProductId()!=0) {
	         String message="One Product updated";
	         template.postForLocation("http://localhost:4041/save", newProduct,Product.class);
	         model.addAttribute("updated",message);}
		return "update_product";
     }
   @RequestMapping(path = "/merchant", method = RequestMethod.GET)
   public String initSearchMerchant() {
       return "merchant";
   }
   
   @RequestMapping(path = "/merchant", method = RequestMethod.POST)
   public String searchByProductMerchant(@RequestParam("merchant") String productMerchant, Model model) {
       model.addAttribute("list", this.template.getForObject("http://localhost:4041/list/"+productMerchant ,Product[].class));
       return "product_list";
   }
   @GetMapping(path = "/inventory")
   public String inventoryAvailability(Model model) {
  	 model.addAttribute("list",template.getForObject("http://localhost:4041/inventoryAvailable",Product[].class));
      model.addAttribute("lists",template.getForObject("http://localhost:4041/zeroInventory",Product[].class));
  	 return "inventory";
   }

}