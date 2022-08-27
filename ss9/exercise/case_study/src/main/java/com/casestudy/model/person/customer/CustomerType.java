package com.casestudy.model.person.customer;

import javax.persistence.*;

@Entity
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int typeCustomerId;
    private String customerTypeName;

    public CustomerType() {
    }

    public CustomerType(int typeCustomerId, String customerTypeName) {
        this.typeCustomerId = typeCustomerId;
        this.customerTypeName = customerTypeName;
    }

    public int getTypeCustomerId() {
        return typeCustomerId;
    }

    public void setTypeCustomerId(int typeCustomerId) {
        this.typeCustomerId = typeCustomerId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }
}
