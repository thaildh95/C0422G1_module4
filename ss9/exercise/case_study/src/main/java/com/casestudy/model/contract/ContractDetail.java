package com.casestudy.model.contract;

import javax.persistence.*;

@Entity
@Table(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContractDetail;
    private String quantity;

    @ManyToOne
    private Contract contract;

    @ManyToOne
    private AttachFacility attachFacility;

    public ContractDetail() {
    }

    public ContractDetail(Integer idContractDetail, String quantity) {
        this.idContractDetail = idContractDetail;
        this.quantity = quantity;
    }

    public Integer getIdContractDetail() {
        return idContractDetail;
    }

    public void setIdContractDetail(Integer idContractDetail) {
        this.idContractDetail = idContractDetail;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachFacility getAttachFacility() {
        return attachFacility;
    }

    public void setAttachFacility(AttachFacility attachFacility) {
        this.attachFacility = attachFacility;
    }
}
