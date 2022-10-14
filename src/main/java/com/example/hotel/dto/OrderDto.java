package com.example.hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Long orderId;

    private String customerName;

    private String hotelName;

    private String cost;

    @Override
    public String toString(){
        return "hotelDto{" +
                "id=" +orderId +
                ", name='" +customerName + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ",cost='" + cost + '\'' +
                '}';

        }
    }



