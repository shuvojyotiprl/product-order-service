package edu.shuvo.streamapi.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.shuvo.streamapi.models.Order;
import edu.shuvo.streamapi.models.Product;
import edu.shuvo.streamapi.services.OrderService;

@RestController
@RequestMapping(path = "/order")
public class OrderController {
	
	
	@Autowired
	OrderService orderService;
	
	
	@GetMapping("category/{category}")
	public List<Order> orderWithProductsBelongtoCategory(@PathVariable String category){
		return orderService.orderWithProductCategory(category);
	}
	
	
	@GetMapping("ordedate/{orderdate}/product")
	public List<Product> listOfProduct(@PathVariable String orderdate){
		String[] arr = orderdate.split("-");
		LocalDate orderDate = LocalDate.of(Integer.parseInt(arr[0]), 
				Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
		
		return orderService.listOfProductOnOrderDate(orderDate);
	}
	
	@GetMapping("productcount")
	public Map<Long,Integer> productCount(){
		return orderService.productCount();
	}
	
	@GetMapping("product-status-map")
	public Map<String, Set<Object>>  productStatusMap(){
		return orderService.dataMapStatusProductMap();
	}
  }
