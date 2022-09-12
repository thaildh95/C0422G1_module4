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
}
