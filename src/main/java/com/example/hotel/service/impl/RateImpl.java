package com.example.hotel.service.impl;

import com.example.hotel.dto.RateDto;
import com.example.hotel.entity.RateEntity;
import com.example.hotel.repository.RateRepository;
import com.example.hotel.service.Service.RateService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
@Transactional
public class RateImpl implements RateService {
    private final RateRepository rateRepository;

    public RateImpl(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }

    @Override
    public Long create(RateDto rateDto) {
        RateEntity rateEntity =new RateEntity();
        rateEntity.setFeedback(rateDto.getFeedBack());
        rateEntity=rateRepository.save(rateEntity);
    return null;
    }

    @Override
    public RateEntity update(Long id, RateDto rateDto) {
        return null;
    }

    @Override
    public RateEntity getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long Id) {

    }
    @Override
    public Iterable<RateEntity> getAll() {
        return null;
    }
}
