package com.building.buildingdemo.repository;

import com.building.buildingdemo.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<Building, Long> {
}
