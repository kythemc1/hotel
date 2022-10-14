package com.example.hotel.service.impl;

import com.example.hotel.dto.OrderDto;
import com.example.hotel.entity.OrderEntity;
import com.example.hotel.service.Service.OrderService;

import java.util.List;
import java.util.Optional;

public class OrderImpl implements OrderService {
    @Override
    public Long create(OrderDto orderDto) {
        return null;
    }

    @Override
    public OrderEntity update(Long id, OrderDto orderDto) {
        return null;
    }

    @Override
    public OrderEntity getById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long Id) {

    }

    @Override
    public List<OrderEntity> getAll() {
        return null;
    }
}
