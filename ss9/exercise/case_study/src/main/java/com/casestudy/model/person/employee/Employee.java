package com.casestudy.model.person.employee;

import com.casestudy.model.person.Person;

public class Employee extends Person {
    private int employeeId;
    private double salary;
    private int positionId;
    private int partId;
    private int levelId;


    public Employee(int employeeId, double salary, int positionId, int partId, int levelId) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.positionId = positionId;
        this.partId = partId;
        this.levelId = levelId;
    }

    public Employee(String name, String dayOfBirth, String idCard, String phoneNumber, String email, String address, int employeeId, double salary, int positionId, int partId, int levelId) {
        super(name, dayOfBirth, idCard, phoneNumber, email, address);
        this.employeeId = employeeId;
        this.salary = salary;
        this.positionId = positionId;
        this.partId = partId;
        this.levelId = levelId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }
}
