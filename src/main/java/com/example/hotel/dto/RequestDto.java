package com.example.hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RequestDto {
    private Long customerId;

    private String customerName;

    private String customerAddress;

    private String age;

    private String cmnd;

    private String hotelId;

    private String hotelAddress;

    private String hotelName;

    private int dinnerLevel;

    private int lunchLevel;

    private int days;

    private int nights;

    private String feedBack;

    @Override
    public String toString(){
        return "requestDto{"+
                "customerId"+customerId+'\''+
                ", age"+age+'\''+
                ", cmnd"+cmnd+'\''+
                ", hotelId"+hotelId+'\''+
                ", hotelAddress"+hotelAddress+'\''+
                ", hotelName"+hotelName+'\''+
                ", dinner"+dinnerLevel+'\''+
                ", lunch"+lunchLevel+'\''+
                ", time"+days+'\''+
                ",nights"+nights+'\''+
                ", feedBack"+feedBack+'\''+
                ", customerName"+customerName+'\''+
                ", customerAddress"+customerAddress+'\''+

                '}';
    }

}
