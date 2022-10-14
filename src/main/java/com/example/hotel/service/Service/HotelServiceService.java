package com.example.hotel.service.Service;

import com.example.hotel.dto.HotelSerViceDto;
import com.example.hotel.entity.HotelServiceEntity;
import com.example.hotel.entity.OrderEntity;

import java.util.List;

public interface HotelServiceService {
    Long create(HotelSerViceDto hotelSerViceDto);

    HotelServiceEntity update(Long id, HotelSerViceDto hotelSerViceDto);

    HotelServiceEntity getById(Long id);

    void delete(Long Id);
    Iterable<HotelServiceEntity> getAll();
}
