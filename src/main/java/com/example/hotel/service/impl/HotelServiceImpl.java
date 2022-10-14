package com.example.hotel.service.impl;

import com.example.hotel.dto.HotelSerViceDto;
import com.example.hotel.entity.HotelServiceEntity;
import com.example.hotel.repository.HotelRepository;
import com.example.hotel.repository.HotelServiceRepository;
import com.example.hotel.service.Service.HotelServiceService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
@Transactional
public class HotelServiceImpl implements HotelServiceService {
    private final HotelServiceRepository hotelServiceRepository;

    private final HotelRepository hotelRepository;
    public HotelServiceImpl(HotelServiceRepository hotelServiceRepository, HotelRepository hotelRepository) {
        this.hotelServiceRepository = hotelServiceRepository;
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Long create(HotelSerViceDto hotelSerViceDto) {
        HotelServiceEntity hotelServiceEntity=new HotelServiceEntity();

        hotelServiceEntity.setDays(hotelSerViceDto.getDays());
        hotelServiceEntity.setNights(hotelSerViceDto.getNights());
        hotelServiceEntity.setLunchlevel(hotelServiceEntity.getLunchlevel());
        hotelServiceEntity.setDinnerLevel(hotelServiceEntity.getDinnerLevel());

        hotelServiceEntity=hotelServiceRepository.save(hotelServiceEntity);

        


        return null;
    }

    @Override
    public HotelServiceEntity update(Long id, HotelSerViceDto hotelSerViceDto) {
        return null;
    }

    @Override
    public HotelServiceEntity getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long Id) {

    }
    @Override
    public Iterable<HotelServiceEntity> getAll() {
        return null;
    }
}
