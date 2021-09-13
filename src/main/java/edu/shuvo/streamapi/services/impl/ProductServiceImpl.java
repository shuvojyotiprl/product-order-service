package edu.shuvo.streamapi.services.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.shuvo.streamapi.models.Product;
import edu.shuvo.streamapi.repo.ProductRepository;
import edu.shuvo.streamapi.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;

	@Override
	public List<Product> liProducts(String category, Double lowerPriceRange) {
		// TODO Auto-generated method stub

		return this.productRepo.findAll().stream().filter(
				product -> product.getCategory().equalsIgnoreCase(category) && product.getPrice() > lowerPriceRange)
				.collect(Collectors.toList());
	}

	@Override
	public List<Product> liAllProducts() {
		// TODO Auto-generated method stub

		return this.productRepo.findAll();

	}

	@Override
	public List<Product> discountedPrice(String category, double percentage) {
		// TODO Auto-generated method stub
		return this.productRepo.findAll().stream().filter(product -> product.getCategory().equalsIgnoreCase(category))
				.map(p -> {
					p.setPrice(p.getPrice() * percentage * 0.01);
					return p;
				}).collect(Collectors.toList());
	}

	@Override
	public Product cheapestProduct(String category) {
		// TODO Auto-generated method stub
		return this.productRepo.findAll().stream().filter(product -> product.getCategory().equalsIgnoreCase(category))
				.sorted(Comparator.comparing(Product::getPrice)).findFirst().get();
	}

	@Override
	public Product costliestProduct(String category) {
		return this.productRepo.findAll().stream().filter(product -> product.getCategory().equalsIgnoreCase(category))
				.sorted((p1, p2) -> {
					return p1.getPrice() > p2.getPrice() ? -1 : 1;
				}).findFirst().get();
	}

	@Override
	public Map<String, List<String>> dataMapCategoryProducts() {
		// TODO Auto-generated method stub

		return productRepo.findAll().stream().collect(
				Collectors.groupingBy(Product::getCategory, Collectors.mapping(
						product->product.getName(), Collectors.toList()))
		);
		
	}

}
