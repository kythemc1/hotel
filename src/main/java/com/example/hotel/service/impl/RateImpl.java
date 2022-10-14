package com.example.hotel.service.impl;

import com.example.hotel.dto.RateDto;
import com.example.hotel.entity.CustomerEntity;
import com.example.hotel.entity.RateEntity;
import com.example.hotel.repository.CustomerEntityRepository;
import com.example.hotel.repository.RateRepository;
import com.example.hotel.service.Service.RateService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
@Transactional
public class RateImpl implements RateService {
    private final RateRepository rateRepository;
    private final CustomerEntityRepository customerEntityRepository;

    public RateImpl(RateRepository rateRepository, CustomerEntityRepository customerEntityRepository) {
        this.rateRepository = rateRepository;
        this.customerEntityRepository = customerEntityRepository;
    }

    @Override
    public Long create(RateDto rateDto) {
        RateEntity rateEntity =new RateEntity();
        rateEntity.setFeedback(rateDto.getFeedBack());
        rateEntity.setRateId(rateEntity.getRateId());

        CustomerEntity customerEntity=new CustomerEntity();
        customerEntity.setCustomerId(rateDto.getCustomerId());
        rateEntity=rateRepository.save(rateEntity);
        customerEntity=customerEntityRepository.save(customerEntity);
    return null;
    }

    @Override
    public RateEntity update(Long id, RateDto rateDto) {
        RateEntity rateEntity =rateRepository.findById(id).orElse(null);
        rateEntity.setFeedback(rateDto.getFeedBack());

        return null;
    }

    @Override
    public RateEntity getById(Long id) {
        return rateRepository.findById(id).orElse(null) ;
    }

    @Override
    public void delete(Long Id) {
        rateRepository.deleteById(Id);
    }
    @Override
    public Iterable<RateEntity> getAll() {
        return rateRepository.findAll();
    }
}
