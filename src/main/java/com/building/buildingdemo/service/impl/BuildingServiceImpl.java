package com.building.buildingdemo.service.impl;

import com.building.buildingdemo.dto.BuildingRequestDTO;
import com.building.buildingdemo.dto.BuildingResponseDTO;
import com.building.buildingdemo.entity.Building;
import com.building.buildingdemo.repository.BuildingRepository;
import com.building.buildingdemo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    @Override
    public void createBuilding(BuildingRequestDTO request) {
        Building building = Building.builder()
                .street(request.getStreet())
                .houseNumber(request.getHouseNumber())
                .floorsCount(request.getFloorsCount())
                .build();

        buildingRepository.save(building);
    }

    @Override
    public List<BuildingResponseDTO> getAllBuildings() {

        return buildingRepository.findAll()
                .stream()
                .map(building -> BuildingResponseDTO.builder()
                        .id(building.getId())
                        .houseNumber(building.getHouseNumber())
                        .street(building.getStreet())
                        .build())
                .collect(Collectors.toList());

    }

    @Override
    public BuildingResponseDTO getBuildingById(Long id) {

        Building building = buildingRepository
                .findById(id)//Optional
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        return BuildingResponseDTO.builder()
                .id(building.getId())
                .houseNumber(building.getHouseNumber())
                .street(building.getStreet())
                .build();
    }
}

