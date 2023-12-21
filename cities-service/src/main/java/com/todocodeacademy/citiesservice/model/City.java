package com.todocodeacademy.citiesservice.model;

import com.todocodeacademy.citiesservice.dto.HotelDTO;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {

    private Long city_id;
    private String name;
    private String continent;
    private String country;
    private String state;

}
