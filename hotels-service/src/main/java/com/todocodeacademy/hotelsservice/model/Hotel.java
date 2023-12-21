package com.todocodeacademy.hotelsservice.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    private Long id;
    private String name;
    private int stars;
    private Long city_id;

}
