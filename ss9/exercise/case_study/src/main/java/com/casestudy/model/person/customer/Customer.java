package com.casestudy.model.person.customer;

import com.casestudy.model.person.Person;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private int typeCustomerId;
    private int gender;

    public Customer() {
    }

    public Customer(int customerId, int typeCustomerId, int gender) {
        this.customerId = customerId;
        this.typeCustomerId = typeCustomerId;
        this.gender = gender;
    }


    public Customer( int typeCustomerId, String name, String dayOfBirth, int gender, String idCard, String phoneNumber, String email, String address ) {
        super(name, dayOfBirth, idCard, phoneNumber, email, address);
        this.customerId = customerId;
        this.typeCustomerId = typeCustomerId;
        this.gender = gender;
    }
    public Customer( int customerId ,int typeCustomerId, String name, String dayOfBirth, int gender, String idCard, String phoneNumber, String email, String address) {
        super(name, dayOfBirth, idCard, phoneNumber, email, address);
        this.customerId = customerId;
        this.typeCustomerId = typeCustomerId;
        this.gender = gender;
    }



    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTypeCustomerId() {
        return typeCustomerId;
    }

    public void setTypeCustomerId(int typeCustomerId) {
        this.typeCustomerId = typeCustomerId;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
