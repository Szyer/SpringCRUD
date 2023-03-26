package com.spring.projectCrud.CustomerDTO;


public class CustomerSaveDTO {


    private String customerName;
    private int mobile;
    private String customerAddress;
    public CustomerSaveDTO(){}





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

    public CustomerSaveDTO( String customerName, int mobile, String customerAddress) {

        this.customerName = customerName;
        this.mobile = mobile;
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +

                ", customerName='" + customerName + '\'' +
                ", mobile=" + mobile +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}

