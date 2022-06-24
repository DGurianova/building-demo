package com.building.buildingdemo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "building")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "floors_count")
    private Integer floorsCount;

    //    public Building(Long id, String street, String houseNumber, Integer floorsCount) {
//        this.id = id;
//        this.street = street;
//        this.houseNumber = houseNumber;
//        this.floorsCount = floorsCount;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getHouseNumber() {
//        return houseNumber;
//    }
//
//    public void setHouseNumber(String houseNumber) {
//        this.houseNumber = houseNumber;
//    }
//
//    public Integer getFloorsCount() {
//        return floorsCount;
//    }
//
//    public void setFloorsCount(Integer floorsCount) {
//        this.floorsCount = floorsCount;
//    }
//
//    @Override
//    public String toString() {
//        return "Building{" +
//                "id=" + id +
//                ", street='" + street + '\'' +
//                ", houseNumber='" + houseNumber + '\'' +
//                ", floorsCount=" + floorsCount +
//                '}';
//    }

}
