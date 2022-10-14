package com.example.hotel.repository;


import com.example.hotel.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface CustomerEntityRepository extends JpaRepository<CustomerEntity,Long>{

}
