package com.casestudy.dto;

import com.casestudy.model.facility.RentalType;
import com.casestudy.model.facility.ServiceType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class FacilityDto implements Validator {

    private Integer facilityId;

    @NotBlank
    @Pattern(regexp = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$", message = "Tên phải viết hoa chữ cái đầu")
    private String facilityName;

    @NotBlank(message = "nhập vào hộ với")
    private String area;

    @NotBlank(message = "nhập vào hộ với")
    private String rentCost;

    @NotBlank(message = "nhập vào hộ với")
    private String maxPeople;

    @NotBlank(message = "nhập vào hộ với")
    private String roomStandar;

    @NotBlank
    @Pattern(regexp = "^([1-9]{1})|([0-9]{20})$",message = "nhập đúng hộ với")
    private String poolArea;

    @NotBlank
    @Pattern(regexp = "^([1-9]{1})|([0-9]{2})$",message = "nhập đúng hộ với")
    private String numberOfFloor;


    private String description;


    private String freeService;

    private ServiceType facilityType;

    private RentalType rentalType;

    public FacilityDto() {
    }

    public FacilityDto(Integer facilityId, String facilityName, String area, String rentCost, String maxPeople, String roomStandar, String poolArea, String numberOfFloor,
                       String description, String freeService, ServiceType facilityType, RentalType rentalType) {
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
        this.facilityType = facilityType;
        this.rentalType = rentalType;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }


    @Override
    public void validate(Object target, Errors errors) {

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
}
