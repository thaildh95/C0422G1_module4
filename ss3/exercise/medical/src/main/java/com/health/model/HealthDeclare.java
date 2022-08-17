package com.health.model;

public class HealthDeclare {
    private String name;
    private String birth;
    private String gender;
    private String nationality;
    private String id;
    private String travelInformation;
    private String vehicle;
    private String seats;
    private String startDay;
    private String endDay;
    private String infomation;

    public HealthDeclare() {
    }

    public HealthDeclare(String name, String birth, String gender, String nationality, String id, String travelInformation, String vehicle, String seats, String startDay, String endDay, String infomation) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.nationality = nationality;
        this.id = id;
        this.travelInformation = travelInformation;
        this.vehicle = vehicle;
        this.seats = seats;
        this.startDay = startDay;
        this.endDay = endDay;
        this.infomation = infomation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(String travelInformation) {
        this.travelInformation = travelInformation;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation;
    }
}
