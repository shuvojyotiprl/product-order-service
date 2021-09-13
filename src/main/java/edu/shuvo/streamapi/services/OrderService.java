package edu.shuvo.streamapi.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.shuvo.streamapi.models.Order;
import edu.shuvo.streamapi.models.Product;

public interface OrderService {
	
	List<Order> orderWithProductCategory(String category);
	
	

	List<Product> listOfProductOnOrderDate(LocalDate orderDate);
	
	Map<Long,Integer> productCount();
	
	Map<String,Set<Object>> dataMapStatusProductMap();
}
