package com.example.hotel.service.Service;

import com.example.hotel.dto.CustomerDto;
import com.example.hotel.entity.CustomerEntity;


public interface CustomerService {
    Long create(CustomerDto customerDto);

    CustomerEntity update(Long id, CustomerDto customerDto);

    CustomerEntity getById(Long id);

    void delete(Long Id);
    Iterable<CustomerEntity> getAll();
}
