package com.example.hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RateDto {
    private Long rateId;

    private String feedBack;

    private Long customerId;
}
