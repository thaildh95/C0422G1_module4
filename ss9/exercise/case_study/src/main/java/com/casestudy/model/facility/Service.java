package com.casestudy.model.facility;

public class Service {
    private int serviceId;
    private String serviceName;
    private double area;
    private double rentCost;
    private int maxPeople;
    private int serviceType;
//    private String stanrdRoom;
//    private String description;
//    private double poolArea;
//    private int numberOfFloor;
//    private String freeService;

    public Service() {
    }

    public Service(int serviceId, String serviceName, double area, double rentCost, int maxPeople, int serviceType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.area = area;
        this.rentCost = rentCost;
        this.maxPeople = maxPeople;
        this.serviceType = serviceType;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getServiceType() {
        return serviceType;
    }

    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }
}
