package com.building.buildingdemo.dto;


import jdk.nashorn.internal.runtime.Debug;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class BuildingResponseDTO {

    private Long id;
    private String street;
    private String houseNumber;


}
