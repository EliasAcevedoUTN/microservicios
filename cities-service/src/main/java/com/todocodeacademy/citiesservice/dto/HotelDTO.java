package com.todocodeacademy.citiesservice.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelDTO {
    private Long id;
    private String name;
    private int stars;
    private Long city_id;
}
