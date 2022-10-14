package com.example.hotel.controller;

import com.example.hotel.dto.HotelDto;
import com.example.hotel.entity.HotelEntity;
import com.example.hotel.service.Service.HotelService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(("/hotel"))
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService){
        this.hotelService=hotelService;
    }

    @PostMapping("/create")
    public Long create(@RequestBody HotelDto hotelDto){
        return hotelService.create(hotelDto);
    }

    @PutMapping("/update/{id}")
    public  HotelEntity update(@PathVariable("id") Long id,@RequestBody HotelDto hotelDto){
        return hotelService.update(id,hotelDto);
    }

    @GetMapping("/get-by-id/{id}")
    public HotelEntity getById(@PathVariable("id") Long id){
       return hotelService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        hotelService.delete(id);
    }

    @GetMapping("/get-all")
    public Iterable<HotelEntity> getAll()
    {
        return hotelService.getAll();
    }
}
