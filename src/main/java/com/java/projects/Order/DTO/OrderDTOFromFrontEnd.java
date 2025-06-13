package com.java.projects.Order.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTOFromFrontEnd {
    List<FoodItemDTO> foodItemList;
    private Integer userId;
    Restaurant restaurant;

}
