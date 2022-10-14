package com.example.hotel.service.impl;

import com.example.hotel.dto.HotelDto;
import com.example.hotel.entity.*;
import com.example.hotel.repository.CustomerEntityRepository;
import com.example.hotel.repository.HotelRepository;
import com.example.hotel.repository.OrderRepository;
import com.example.hotel.repository.RateRepository;
import com.example.hotel.service.Service.HotelService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
@Transactional
public class HotelImpl implements HotelService {


    private final HotelRepository hotelRepository;

    public HotelImpl(OrderRepository orderRepository, CustomerEntityRepository customerEntityRepository, HotelRepository hotelRepository, RateRepository rateRepository) {
        this.hotelRepository = hotelRepository;

    }
    @Override
    public Long create(HotelDto hotelDto) {

        HotelEntity hotelEntity=new HotelEntity();
        hotelEntity.setHotelId(hotelDto.getHotelId());
        hotelEntity.setAddress(hotelDto.getAddress());
        hotelEntity.setName(hotelDto.getName());
        hotelEntity=hotelRepository.save(hotelEntity);
        return  null;
    }

    @Override
    public HotelEntity update(Long id,HotelDto hotelDto) {
        HotelEntity hotelEntity= hotelRepository.findById(id).orElse(null);
        hotelEntity.setName(hotelDto.getName());
        hotelEntity.setAddress((hotelEntity.getAddress()));
        return null;
    }

    @Override
    public HotelEntity getById(Long id) {
        return hotelRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long Id) {
        hotelRepository.deleteById(Id);
    }

    @Override
    public Iterable<HotelEntity> getAll() {
        return hotelRepository.findAll();
    }
}
