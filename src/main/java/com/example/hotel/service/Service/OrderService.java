package com.example.hotel.service.Service;

import com.example.hotel.dto.OrderDto;
import com.example.hotel.entity.OrderEntity;

import java.util.List;

public interface OrderService {
    Long create(OrderDto orderDto);

    OrderEntity update(Long id, OrderDto orderDto);

    OrderEntity getById(Long id);

    void delete(Long Id);

    Iterable<OrderEntity> getAll();
}
