package com.casestudy.model.person.customer;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeCustomerId;
    private String customerTypeName;

    @OneToMany(mappedBy = "customerType",cascade= CascadeType.ALL)
    private List<Customer> customerList;

    public CustomerType() {
    }

    public CustomerType(Integer typeCustomerId, String customerTypeName) {
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
