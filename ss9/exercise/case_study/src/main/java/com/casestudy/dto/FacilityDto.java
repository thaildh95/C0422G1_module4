package com.casestudy.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;

public class FacilityDto implements Validator {

    private Integer facilityId;

    @NotBlank
    private String facilityName;

    @NotBlank
    private String area;

    @NotBlank
    private String rentCost;

    @NotBlank
    private String maxPeople;

    @NotBlank
    private String roomStandar;

    private String poolArea;

    private String numberOfFloor;

    private String description;

    private String freeService;


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }


    @Override
    public void validate(Object target, Errors errors) {

    }
}
