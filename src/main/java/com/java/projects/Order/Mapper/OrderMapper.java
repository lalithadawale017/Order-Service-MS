package com.java.projects.Order.Mapper;

import com.java.projects.Order.DTO.OrderDTO;
import com.java.projects.Order.Entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper Instance= Mappers.getMapper(OrderMapper.class);
    Order mapOrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO mapOrderToOrderDTO(Order order);
}
