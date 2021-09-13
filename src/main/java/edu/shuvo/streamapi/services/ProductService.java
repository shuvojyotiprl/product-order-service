package edu.shuvo.streamapi.services;

import java.util.List;
import java.util.Map;

import edu.shuvo.streamapi.models.Product;

public interface ProductService {
	List<Product> liProducts(String category, Double lowerPriceRange);
	
	List<Product> liAllProducts();
	
	List<Product> discountedPrice(String category, double percentage);
	
	
	Product cheapestProduct(String category);
	
	Product costliestProduct(String category);
	
	Map<String,List<String>> dataMapCategoryProducts();
	
}
