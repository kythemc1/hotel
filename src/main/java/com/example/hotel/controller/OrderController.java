package com.example.hotel.controller;

import com.example.hotel.dto.OrderDto;
import com.example.hotel.entity.OrderEntity;
import com.example.hotel.service.Service.OrderService;
import org.springframework.web.bind.annotation.*;

public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping("/create")
    public Long create(@RequestBody OrderDto orderDto){
        return orderService.create(orderDto);
    }

    @PutMapping("/update/{id}")
    public OrderEntity update(@PathVariable("id") Long id, @RequestBody OrderDto orderDto){
        return orderService.update(id,orderDto);
    }

    @GetMapping("/get-by-id/{id}")
    public OrderEntity getById(@PathVariable("id")Long id){
        return orderService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public  void delete(@PathVariable("id")Long id){
        orderService.delete(id);
    }

    @GetMapping("/get-all")
    public Iterable<OrderEntity> getAll(){
        return orderService.getAll();
    }
}
