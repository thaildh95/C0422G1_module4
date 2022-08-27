package com.casestudy.model.person.employee;

public class Position {
    private int employeeId;
    private String positionName;

    public Position() {
    }

    public Position(int employeeId, String positionName) {
        this.employeeId = employeeId;
        this.positionName = positionName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
