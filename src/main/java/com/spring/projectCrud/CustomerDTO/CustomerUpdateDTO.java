package com.spring.projectCrud.CustomerDTO;


public class CustomerUpdateDTO {

    private int customerid;
    private String customerName;
    private int mobile;
    private String customerAddress;
    public CustomerUpdateDTO(){}

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

    public CustomerUpdateDTO(int customerid, String customerName, int mobile, String customerAddress) {
        this.customerid = customerid;
        this.customerName = customerName;
        this.mobile = mobile;
        this.customerAddress = customerAddress;
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
