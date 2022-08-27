package com.casestudy.model.service;

public class House extends Service {
private String roomStandar;
private int numberOfFloor;

    public House(String roomStandar, int numberOfFloor) {
        this.roomStandar = roomStandar;
        this.numberOfFloor = numberOfFloor;
    }

    public House(int serviceId, String serviceName, double area, double rentCost, int maxPeople, int serviceType, String roomStandar, int numberOfFloor) {
        super(serviceId, serviceName, area, rentCost, maxPeople, serviceType);
        this.roomStandar = roomStandar;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandar() {
        return roomStandar;
    }

    public void setRoomStandar(String roomStandar) {
        this.roomStandar = roomStandar;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
