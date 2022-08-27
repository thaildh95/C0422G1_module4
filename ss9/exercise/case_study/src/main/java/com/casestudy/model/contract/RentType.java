package com.casestudy.model.contract;

public class RentType {
    private int rentId;
    private String  rentTypeName;

    public RentType(int rentId, String rentTypeName) {
        this.rentId = rentId;
        this.rentTypeName = rentTypeName;
    }

    public RentType() {
    }

    public int getRentId() {
        return rentId;
    }

    public void setRentId(int rentId) {
        this.rentId = rentId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }
}
