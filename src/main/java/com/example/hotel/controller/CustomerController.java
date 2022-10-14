package com.example.hotel.controller;

import com.example.hotel.dto.CustomerDto;
import com.example.hotel.entity.CustomerEntity;
import com.example.hotel.service.Service.CustomerService;
import org.aspectj.apache.bcel.generic.LineNumberGen;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping("/create")
    public Long create(@RequestBody CustomerDto customerDto){
        return customerService.create(customerDto);
    }

    @PutMapping("/update/{id}")
    public CustomerEntity update(@PathVariable("id") Long id,@RequestBody CustomerDto customerDto){
        return customerService.update(id,customerDto);
    }

    @GetMapping("/get-by-id/{id}")
    public CustomerEntity getById(@PathVariable("id")Long id){
        return customerService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public  void delete(@PathVariable("id")Long id){
        customerService.delete(id);
    }

    @GetMapping("/get-all")
    public Iterable<CustomerEntity> getAll(){
        return customerService.getAll();
    }

}
