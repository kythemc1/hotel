package com.example.hotel.repository;

import com.example.hotel.entity.HotelServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelServiceRepository extends JpaRepository<HotelServiceEntity,Long> {
}
