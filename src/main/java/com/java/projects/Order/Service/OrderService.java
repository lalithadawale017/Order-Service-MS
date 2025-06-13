package com.java.projects.Order.Service;

import com.java.projects.Order.DTO.OrderDTO;
import com.java.projects.Order.DTO.OrderDTOFromFrontEnd;
import com.java.projects.Order.DTO.UserDTO;
import com.java.projects.Order.Entity.Order;
import com.java.projects.Order.Mapper.OrderMapper;
import com.java.projects.Order.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
   @Autowired
    OrderRepo orderRepo;

   @Autowired
   SequenceGenerator sequenceGenerator;

   @Autowired
    RestTemplate restTemplate;
    public OrderDTO saveOrderInDB(OrderDTOFromFrontEnd orderDetails) {
        Integer newOrderId=sequenceGenerator.GenerateNextOrderId();
        UserDTO userDTO=fetchOrderDetailsFromUserId(orderDetails.getUserId());
       if (userDTO==null){throw new RuntimeException("UserDto is null");}
        Order orderToBeSaved=new Order(newOrderId,orderDetails.getFoodItemList(),orderDetails.getRestaurant(),userDTO);

        orderRepo.save(orderToBeSaved);
        return OrderMapper.Instance.mapOrderToOrderDTO(orderToBeSaved);
    }

    private UserDTO fetchOrderDetailsFromUserId(Integer userId) {
     return restTemplate.getForObject("http://USER-SERVICE/user/fetchUserById/"+userId,UserDTO.class);
    }
}
