package com.casestudy.model.contract;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "attach_facility")
public class AttachFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer attachId;

    private String attachFacilityName;
    private Double price;
    private Integer unit;
    private String status;

    @OneToMany(mappedBy = "attachFacility")
    private List<ContractDetail> contractDetailList;

    public AttachFacility() {
    }

    public AttachFacility(Integer attachId, String attachFacilityName, Double price, Integer unit, String status, List<ContractDetail> contractDetailList) {
        this.attachId = attachId;
        this.attachFacilityName = attachFacilityName;
        this.price = price;
        this.unit = unit;
        this.status = status;
        this.contractDetailList = contractDetailList;
    }

    public Integer getAttachId() {
        return attachId;
    }

    public void setAttachId(Integer attachId) {
        this.attachId = attachId;
    }

    public String getAttachFacilityName() {
        return attachFacilityName;
    }

    public void setAttachFacilityName(String attachFacilityName) {
        this.attachFacilityName = attachFacilityName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }
}
