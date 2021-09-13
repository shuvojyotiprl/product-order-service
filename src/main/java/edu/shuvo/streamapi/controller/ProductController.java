package edu.shuvo.streamapi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.shuvo.streamapi.models.Product;
import edu.shuvo.streamapi.services.ProductService;

@RestController
@RequestMapping(path = "/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	
	@GetMapping("/")
	public List<Product> findAllProducts(){
		System.out.println("** inside controller **");
		return productService.liAllProducts();
	}
	
	
	@GetMapping("category/{category}/lowerpricerange/{lowerPriceRange}")
	public List<Product> findFilteredProducts(@PathVariable String category, @PathVariable String lowerPriceRange){
		return productService.liProducts(category, Double.parseDouble(lowerPriceRange));
	}
	
	
	@GetMapping("category/{category}/discount/{discount}")
	public List<Product> getDiscountedProducts(@PathVariable String category,@PathVariable String discount){
		return productService.discountedPrice(category, Double.parseDouble(discount));
	}
	
	@GetMapping("cheapest/category/{category}")
	public Product cheapestProduct(@PathVariable String category) {
		return productService.cheapestProduct(category);
	}
	
	

	@GetMapping("costliest/category/{category}")
	public Product costliesttProduct(@PathVariable String category) {
		return productService.costliestProduct(category);
	}
	
	
	@GetMapping("/datamap/category-product-list")
	public Map<String, List<String>> getDataMapCategoryProductList() {
		return productService.dataMapCategoryProducts();
	}
	
}
