package com.spring.projectCrud.CustomerDTO;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CustomerDTO {


    private int customerid;
    private String customerName;
    private int mobile;
    private String customerAddress;
    public CustomerDTO(){}

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public CustomerDTO(int customerid, String customerName,  String customerAddress, int mobile) {
        this.customerid = customerid;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.mobile = mobile;

    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerid=" + customerid +
                ", customerName='" + customerName + '\'' +
                ", mobile=" + mobile +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
