package com.casestudy.model.person.customer;

import javax.persistence.*;


@Entity
@Table(name = "Trade_Info")
public class TradeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tradeId;
    private String tradeSerial;
    private String tradeDay;
    private String bill;
    private String facilityType;
    private String area;

    public TradeInfo() {
    }

    public TradeInfo(Integer tradeId, String tradeDay, String bill, String facilityType, String area) {
        this.tradeId = tradeId;
        this.tradeDay = tradeDay;
        this.bill = bill;
        this.facilityType = facilityType;
        this.area = area;
    }

    @ManyToOne
    private Customer customerId;

    public TradeInfo(Integer tradeId, String tradeSerial, String tradeDay, String bill, String facilityType, String area) {
        this.tradeId = tradeId;
        this.tradeSerial = tradeSerial;
        this.tradeDay = tradeDay;
        this.bill = bill;
        this.facilityType = facilityType;
        this.area = area;
    }

    public Integer getTradeId() {
        return tradeId;
    }

    public void setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
    }

    public String getTradeSerial() {
        return tradeSerial;
    }

    public void setTradeSerial(String tradeSerial) {
        this.tradeSerial = tradeSerial;
    }

    public String getTradeDay() {
        return tradeDay;
    }

    public void setTradeDay(String tradeDay) {
        this.tradeDay = tradeDay;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }
}
