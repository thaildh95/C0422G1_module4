package com.casestudy.model.facility;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rental_type")
public class RentalType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRentalType;
    private String rentalTypeName;

    @OneToMany(mappedBy = "rentalType")
    private List<Facility> facilityList;

    public RentalType(int idRentalType, String rentalTypeName, List<Facility> facilityList) {
        this.idRentalType = idRentalType;
        this.rentalTypeName = rentalTypeName;
        this.facilityList = facilityList;
    }

    public RentalType() {
    }

    public int getIdRentalType() {
        return idRentalType;
    }

    public void setIdRentalType(int idRentalType) {
        this.idRentalType = idRentalType;
    }

    public String getRentalTypeName() {
        return rentalTypeName;
    }

    public void setRentalTypeName(String rentalTypeName) {
        this.rentalTypeName = rentalTypeName;
    }

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }
}
