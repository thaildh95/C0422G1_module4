package com.casestudy.model.person.employee;


import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private  String name;
    private String dayOfBirth;
    private int gender;
    private String idCard;
    private String phoneNumber;
    private String Email;
    private String address;
    private String salary;

    @ManyToOne
    private Level levelType;

    @ManyToOne
    private Part partType;

    @ManyToOne
    private Position positionType;

    public Employee() {
    }

    public Employee(Integer employeeId, String name, String dayOfBirth, int gender, String idCard, String phoneNumber, String email, String address, String salary, Level levelType, Part partType, Position positionType) {
        this.employeeId = employeeId;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        Email = email;
        this.address = address;
        this.salary = salary;
        this.levelType = levelType;
        this.partType = partType;
        this.positionType = positionType;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Level getLevelType() {
        return levelType;
    }

    public void setLevelType(Level levelType) {
        this.levelType = levelType;
    }

    public Part getPartType() {
        return partType;
    }

    public void setPartType(Part partType) {
        this.partType = partType;
    }

    public Position getPositionType() {
        return positionType;
    }

    public void setPositionType(Position positionType) {
        this.positionType = positionType;
    }
}
