package com.example.hotel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hotel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelEntity {

    @Id
    @GeneratedValue
    private Long hotelId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

}
