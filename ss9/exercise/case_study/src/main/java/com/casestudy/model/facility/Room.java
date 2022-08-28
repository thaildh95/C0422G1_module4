package com.casestudy.model.facility;

public class Room extends Service{
    String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(int serviceId, String serviceName, double area, double rentCost, int maxPeople, int serviceType, String freeService) {
        super(serviceId, serviceName, area, rentCost, maxPeople, serviceType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
