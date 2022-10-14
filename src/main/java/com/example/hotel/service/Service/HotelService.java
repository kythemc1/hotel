package com.example.hotel.service.Service;



import com.example.hotel.dto.HotelDto;
import com.example.hotel.entity.HotelEntity;

import java.util.List;

public interface HotelService {
    Long create(HotelDto hotelDto);

    HotelEntity update(Long id,HotelDto hotelDto);

    HotelEntity getById(Long id);

    void delete(Long Id);

    Iterable<HotelEntity> getAll();
}
