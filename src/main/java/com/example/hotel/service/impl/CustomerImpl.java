package com.example.hotel.service.impl;

import com.example.hotel.dto.CustomerDto;
import com.example.hotel.entity.CustomerEntity;
import com.example.hotel.repository.CustomerEntityRepository;
import com.example.hotel.service.Service.CustomerService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class CustomerImpl implements CustomerService {

    private final CustomerEntityRepository customerEntityRepository;

    public CustomerImpl(CustomerEntityRepository customerEntityRepository) {
        this.customerEntityRepository = customerEntityRepository;
    }

    @Override
    public Long create(CustomerDto customerDto) {
        CustomerEntity customerEntity =new CustomerEntity();
        customerEntity.setAddress(customerDto.getAddress());
        customerEntity.setCmnd(customerDto.getCmnd());
        customerEntity.setAge(customerDto.getAge());
        customerEntity.setName(customerDto.getName());

        customerEntity=customerEntityRepository.save(customerEntity);
        return null;
    }

    @Override
    public CustomerEntity update(Long id, CustomerDto customerDto) {
        CustomerEntity customerEntity=customerEntityRepository.findById(id).orElse(null);
        customerEntity.setName(customerDto.getName());
        customerEntity.setAge(customerDto.getAge());
        customerEntity.setAddress(customerDto.getAddress());
        customerEntity.setCmnd(customerDto.getCmnd());
        return null;
    }

    @Override
    public CustomerEntity getById(Long id) {
        return customerEntityRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long Id) {
        customerEntityRepository.deleteById(Id);
    }

    @Override
    public Iterable<CustomerEntity> getAll() {
        return customerEntityRepository.findAll();
    }

}
