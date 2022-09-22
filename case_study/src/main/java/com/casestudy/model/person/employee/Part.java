package com.casestudy.model.person.employee;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "part")
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int partId;
    private String partName;

    @OneToMany(mappedBy = "partType")
    private List<Employee> employeeList;

    public Part() {
    }

    public Part(int partId, String partName) {
        this.partId = partId;
        this.partName = partName;

    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
