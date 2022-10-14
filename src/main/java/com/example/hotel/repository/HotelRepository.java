package com.example.hotel.repository;

import com.example.hotel.entity.HotelEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HotelRepository extends CrudRepository<HotelEntity,Long> {

}
