package com.example.demo.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
public class OrderController {
	@Autowired
	private RestTemplate template;
	public List<Product> listOfProducts=new ArrayList<>();
	Product orderProduct;
	public OrderController() {
		super();
		
	}

	@PostMapping(path = "/save_order")
	    public String saveOrders(Model model ,@RequestParam int id,@RequestParam String customerName,@RequestParam int productId,@RequestParam String orderDate,@RequestParam int quantity) {
	     Product orderProduct = null;
	     URI uri=null;
	  try {
	      uri = new URI("http://localhost:4041/list");
	  } catch (URISyntaxException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	  }
     Product[] temp=template.getForObject(uri,Product[].class);
     listOfProducts = Arrays.asList(temp);
     for(Product eachProduct:listOfProducts) {
         if(eachProduct.getProductId()==productId) {
             orderProduct =eachProduct;
         }
     }
     LocalDate date =LocalDate.parse(orderDate);
     Order newOrder= new Order(id,orderProduct,date,quantity,customerName) ;
     if(newOrder.getOrderId()!=0) {
         String message="One Order Added";
        template.postForLocation("http://localhost:4042/save", newOrder,Order.class);
         model.addAttribute("created",message);
     }
      
        return "save_order";
     }
  @GetMapping(path = "/update_order")
  public String updateOrders() {
	  return "update_order";
  }
 @RequestMapping(path = "/update_order",method = RequestMethod.POST)
 public String updateOrders(Model model ,@RequestParam int id,@RequestParam String customerName,@RequestParam int productId,@RequestParam String orderDate,@RequestParam int quantity) {
	 Product orderProduct = null;
     URI uri=null;
  try {
      uri = new URI("http://localhost:4041/list");
  } catch (URISyntaxException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
  }
     Product[] temp=template.getForObject(uri,Product[].class);
     listOfProducts = Arrays.asList(temp);
     for(Product eachProduct:listOfProducts) {
         if(eachProduct.getProductId()==productId) {
             orderProduct =eachProduct;
         }
     }
     LocalDate date =LocalDate.parse(orderDate);
     Order newOrder= new Order(id,orderProduct,date,quantity,customerName) ;
     if(newOrder.getOrderId()!=0) {
         String message="One Order Updated";
        template.postForObject("http://localhost:4042/save", newOrder, Order.class);
         model.addAttribute("updated",message);
     }
     return "update_order";
  }
   @GetMapping(path = "/order_list")
   public String getOrders(Model model) {
       model.addAttribute("list",template.getForObject("http://localhost:4042/list",Order[].class));
       return "order_list";
    }
   @RequestMapping(path = "/order_id", method = RequestMethod.GET)
   public String initSearchId() {
       return "order_id";
   }
   
   @RequestMapping(path = "/order_id", method = RequestMethod.POST)
   public String searchById(@RequestParam("id") String id, Model model) {
	   int orderId = Integer.parseInt(id);
       model.addAttribute("list", this.template.getForObject("http://localhost:4042/list/"+orderId ,Order[].class));
       return "order_list";
   }
   @RequestMapping(path = "/user", method = RequestMethod.GET)
   public String initSearchCustomerName() {
       return "user";
   }
   
   @RequestMapping(path = "/user", method = RequestMethod.POST)
   public String searchByCustomerName(@RequestParam("customerName") String customerName, Model model) {
       model.addAttribute("list", this.template.getForObject("http://localhost:4042/list/user/"+customerName ,Order[].class));
       return "order_list";
   }
}
