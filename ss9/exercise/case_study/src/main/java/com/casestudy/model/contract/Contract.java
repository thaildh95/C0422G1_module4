package com.casestudy.model.contract;

import com.casestudy.model.facility.Facility;
import com.casestudy.model.person.customer.Customer;
import com.casestudy.model.person.employee.Employee;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contractId;
    private LocalDate startDay;
    private LocalDate endDay;
    private double deposit;

    @ManyToOne
    private Facility facility;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Employee employee;

    @OneToMany(mappedBy = "idContractDetail")
    private List<ContractDetail> contractDetail;

    public Contract() {
    }

    public Contract(Integer contractId, LocalDate startDay, LocalDate endDay, double deposit) {
        this.contractId = contractId;
        this.startDay = startDay;
        this.endDay = endDay;
        this.deposit = deposit;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<ContractDetail> getContractDetail() {
        return contractDetail;
    }

    public void setContractDetail(List<ContractDetail> contractDetail) {
        this.contractDetail = contractDetail;
    }
}
