package com.example.hotel.controller;

import com.example.hotel.dto.CustomerDto;
import com.example.hotel.dto.HotelSerViceDto;
import com.example.hotel.entity.CustomerEntity;
import com.example.hotel.entity.HotelServiceEntity;
import com.example.hotel.service.Service.HotelServiceService;
import org.springframework.web.bind.annotation.*;

public class HotelServiceController {
    private final HotelServiceService hotelServiceService;

    public HotelServiceController(HotelServiceService hotelServiceService) {
        this.hotelServiceService = hotelServiceService;
    }


    @PostMapping("/create")
    public Long create(@RequestBody HotelSerViceDto hotelSerViceDto){
        return hotelServiceService.create(hotelSerViceDto);
    }

    @PutMapping("/update/{id}")
    public HotelServiceEntity update(@PathVariable("id") Long id, @RequestBody HotelSerViceDto hotelSerViceDto){
        return hotelServiceService.update(id,hotelSerViceDto);
    }

    @GetMapping("/get-by-id/{id}")
    public HotelServiceEntity getById(@PathVariable("id")Long id){
        return hotelServiceService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public  void delete(@PathVariable("id")Long id){
        hotelServiceService.delete(id);
    }

    @GetMapping("/get-all")
    public Iterable<HotelServiceEntity> getAll(){
        return hotelServiceService.getAll();
    }
}
