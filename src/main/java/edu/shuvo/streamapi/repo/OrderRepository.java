package edu.shuvo.streamapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.shuvo.streamapi.models.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

}
