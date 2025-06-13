package com.java.projects.Order.Repository;

import com.java.projects.Order.Entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends MongoRepository<Order,Integer> {


}
