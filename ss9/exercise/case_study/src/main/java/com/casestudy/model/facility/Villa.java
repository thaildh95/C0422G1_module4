package com.casestudy.model.facility;

public class Villa extends Service {
    private String roomStandar;
    private double poolArea;
    private int numberOfFloor;
    private String description;

    public Villa(String roomStandar, double poolArea, int numberOfFloor, String description) {
        this.roomStandar = roomStandar;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
        this.description = description;
    }

    public Villa(int serviceId, String serviceName, double area, double rentCost, int maxPeople, int serviceType, String roomStandar, double poolArea, int numberOfFloor, String description) {
        super(serviceId, serviceName, area, rentCost, maxPeople, serviceType);
        this.roomStandar = roomStandar;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
        this.description = description;
    }

    public String getRoomStandar() {
        return roomStandar;
    }

    public void setRoomStandar(String roomStandar) {
        this.roomStandar = roomStandar;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
