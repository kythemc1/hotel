package com.example.hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelSerViceDto{
    private Long serviceId;

    private int days;

    private int nights;

    private int lunchLevel;

    private int dinnerLevel;

}
