package com.example.hotel.repository;

import com.example.hotel.entity.RateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateRepository extends JpaRepository<RateEntity,Long> {
}
