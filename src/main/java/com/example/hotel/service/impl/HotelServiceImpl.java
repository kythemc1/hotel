package com.example.hotel.service.impl;

import com.example.hotel.dto.HotelSerViceDto;
import com.example.hotel.entity.HotelServiceEntity;
import com.example.hotel.entity.OrderEntity;
import com.example.hotel.service.Service.HotelServiceService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class HotelServiceImpl implements HotelServiceService {
    @Override
    public Long create(HotelSerViceDto hotelSerViceDto) {
        return null;
    }

    @Override
    public HotelServiceEntity update(Long id, HotelSerViceDto hotelSerViceDto) {
        return null;
    }

    @Override
    public HotelServiceEntity getById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long Id) {

    }
    @Override
    public Iterable<HotelServiceEntity> getAll() {
        return null;
    }
}
