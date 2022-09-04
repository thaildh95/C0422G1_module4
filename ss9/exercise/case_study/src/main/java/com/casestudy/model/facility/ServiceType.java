package com.casestudy.model.facility;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service_type")
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServiceType;
    private String facilityTypeName;

    @OneToMany(mappedBy = "facilityType")
    private List<Facility> facilityList;

    public ServiceType() {
    }

    public ServiceType(Integer idServiceType, String facilityTypeName) {
        this.idServiceType = idServiceType;
        this.facilityTypeName = facilityTypeName;

    }

    public Integer getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(Integer idServiceType) {
        this.idServiceType = idServiceType;
    }

    public String getFacilityTypeName() {
        return facilityTypeName;
    }

    public void setFacilityTypeName(String facilityTypeName) {
        this.facilityTypeName = facilityTypeName;
    }

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }
}
