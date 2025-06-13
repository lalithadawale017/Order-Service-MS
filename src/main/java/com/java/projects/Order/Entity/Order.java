package com.java.projects.Order.Entity;

import com.java.projects.Order.DTO.FoodItemDTO;
import com.java.projects.Order.DTO.Restaurant;
import com.java.projects.Order.DTO.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {
 private Integer orderId;
 private List<FoodItemDTO> foodItemDTOList;
  private Restaurant restaurant;
  private UserDTO userDTO;


}
