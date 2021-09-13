package edu.shuvo.streamapi.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.shuvo.streamapi.models.Order;
import edu.shuvo.streamapi.models.Product;
import edu.shuvo.streamapi.repo.OrderRepository;
import edu.shuvo.streamapi.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepo;

	@Override
	public List<Order> orderWithProductCategory(String category) {
		// TODO Auto-generated method stub

		return orderRepo.findAll().stream().filter(
				order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equals(category)))
				.collect(Collectors.toList());

	}

	@Override
	public List<Product> listOfProductOnOrderDate(LocalDate orderDate) {
		// TODO Auto-generated method stub

		return orderRepo.findAll().stream().filter(order -> order.getOrderDate().isEqual(orderDate)).peek(o -> {
			System.out.println(o);
		}).flatMap(order -> order.getProducts().stream()).distinct().collect(Collectors.toList());

	}

	@Override
	public Map<Long, Integer> productCount() {
		// TODO Auto-generated method stub
		return orderRepo.findAll().stream()
				.collect(Collectors.toMap(order -> order.getId(), order -> order.getProducts().size()));
	}

	@Override
	public Map<String, Set<Object>> dataMapStatusProductMap() {
		// TODO Auto-generated method stub

		
		  Map<String, Set<Object>> x =
		  orderRepo.findAll().stream().collect(Collectors.groupingBy(Order::getStatus,
		  Collectors.mapping(order->order.getProducts().stream().map(p->p.getName()),
		  Collectors.toSet())));
		 

		//orderRepo.findAll().stream().flatMap(o -> o.getProducts().stream());
		return x;
	}

}
