package com.java.projects.Order.Mapper;

import com.java.projects.Order.DTO.FoodItemDTO;
import com.java.projects.Order.DTO.OrderDTO;
import com.java.projects.Order.Entity.Order;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-27T17:25:59+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.24 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order mapOrderDTOToOrder(OrderDTO orderDTO) {
        if ( orderDTO == null ) {
            return null;
        }

        Order order = new Order();

        order.setOrderId( orderDTO.getOrderId() );
        List<FoodItemDTO> list = orderDTO.getFoodItemDTOList();
        if ( list != null ) {
            order.setFoodItemDTOList( new ArrayList<FoodItemDTO>( list ) );
        }
        order.setRestaurant( orderDTO.getRestaurant() );
        order.setUserDTO( orderDTO.getUserDTO() );

        return order;
    }

    @Override
    public OrderDTO mapOrderToOrderDTO(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setOrderId( order.getOrderId() );
        List<FoodItemDTO> list = order.getFoodItemDTOList();
        if ( list != null ) {
            orderDTO.setFoodItemDTOList( new ArrayList<FoodItemDTO>( list ) );
        }
        orderDTO.setRestaurant( order.getRestaurant() );
        orderDTO.setUserDTO( order.getUserDTO() );

        return orderDTO;
    }
}
