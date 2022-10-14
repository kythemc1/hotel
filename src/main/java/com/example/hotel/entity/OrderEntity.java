package com.example.hotel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="oder")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customerEntity;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotelEntity;


    @Column(name = "customerName")
    private String customerName;

    @Column(name = "days" )
    private int days;

    @Column(name = "nights")
    private int nights;


    @Column(name = "dinnerLevel")
    private int dinnerlevel;

    @Column(name = "lunchLevel")
    private  int lunchLevel;

    @Column(name = "cost")
    private String cost;

}


