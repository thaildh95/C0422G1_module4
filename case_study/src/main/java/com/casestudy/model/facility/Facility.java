package com.casestudy.model.facility;

import javax.persistence.*;

@Entity
@Table(name = "facility")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer facilityId;
    private String facilityName;
    private String area;
    private String rentCost;
    private String maxPeople;
    private String roomStandar;
    private String poolArea;
    private String numberOfFloor;
    private String description;
    private String freeService;

    @ManyToOne
    private ServiceType facilityType;
    @ManyToOne
    private RentalType rentalType;

    public Facility() {
    }

    public ServiceType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(ServiceType facilityType) {
        this.facilityType = facilityType;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }

    public Facility(Integer facilityId, String facilityName, String area, String rentCost, String maxPeople, String serviceType, String roomStandar, String poolArea, String numberOfFloor, String description, String freeService) {
        this.facilityId = facilityId;
        this.facilityName = facilityName;
        this.area = area;
        this.rentCost = rentCost;
        this.maxPeople = maxPeople;
        this.roomStandar = roomStandar;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
        this.description = description;
        this.freeService = freeService;
    }

    public Integer getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRentCost() {
        return rentCost;
    }

    public void setRentCost(String rentCost) {
        this.rentCost = rentCost;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRoomStandar() {
        return roomStandar;
    }

    public void setRoomStandar(String roomStandar) {
        this.roomStandar = roomStandar;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
