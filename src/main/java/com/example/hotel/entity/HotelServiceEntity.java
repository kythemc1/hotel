package com.example.hotel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "service")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HotelServiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceId;

    @Column(name = "days")
    private int days;

    @Column(name = "nights")
    private  int nights;

    @Column(name = "lunchLevel")
    private int lunchlevel;

    @Column(name = "dinnerLevel")
    private  int dinnerLevel;

    @ManyToOne
    @JoinColumn(name = "hotel_id",nullable = false)
    private HotelEntity hotelEntity;

}
