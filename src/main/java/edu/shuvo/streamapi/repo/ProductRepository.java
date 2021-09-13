package edu.shuvo.streamapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.shuvo.streamapi.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
