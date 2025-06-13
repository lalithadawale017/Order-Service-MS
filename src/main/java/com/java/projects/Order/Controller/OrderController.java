package com.java.projects.Order.Controller;

import com.java.projects.Order.DTO.OrderDTO;
import com.java.projects.Order.DTO.OrderDTOFromFrontEnd;
import com.java.projects.Order.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromFrontEnd orderDetails){
      OrderDTO orderSavedInDB= orderService.saveOrderInDB(orderDetails);
      return new ResponseEntity<>(orderSavedInDB, HttpStatus.CREATED);
    }
}
