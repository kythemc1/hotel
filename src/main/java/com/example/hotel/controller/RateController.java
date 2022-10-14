package com.example.hotel.controller;

import com.example.hotel.dto.RateDto;
import com.example.hotel.entity.RateEntity;
import com.example.hotel.service.Service.RateService;
import org.springframework.web.bind.annotation.*;

public class RateController {
    private final RateService rateService;

    public RateController(RateService rateService) {
        this.rateService = rateService;
    }


    @PostMapping("/create")
    public Long create(@RequestBody RateDto rateDto){
        return rateService.create(rateDto);
    }

    @PutMapping("/update/{id}")
    public RateEntity update(@PathVariable("id") Long id, @RequestBody RateDto rateDto){
        return rateService.update(id,rateDto);
    }

    @GetMapping("/get-by-id/{id}")
    public RateEntity getById(@PathVariable("id")Long id){
        return rateService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public  void delete(@PathVariable("id")Long id){
        rateService.delete(id);
    }

    @GetMapping("/get-all")
    public Iterable<RateEntity> getAll(){
        return rateService.getAll();
    }
}
