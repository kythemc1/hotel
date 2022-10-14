package com.example.hotel.service.Service;

import com.example.hotel.dto.RateDto;
import com.example.hotel.entity.OrderEntity;
import com.example.hotel.entity.RateEntity;

import java.util.List;

public interface RateService {
    Long create(RateDto rateDto);

    RateEntity update(Long id, RateDto rateDto);

    RateEntity getById(Long id);
    void delete(Long Id);

    Iterable<RateEntity> getAll();
}
