package com.spring.projectCrud.Entity;

import javax.persistence.*;
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "customer_id", length = 50 )
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int customerid;
    @Column(name = "customer_name", length = 50 )
    private String customerName;

    @Column(name = "customer_mobile", length = 10 )
    private int mobile;
    @Column(name = "customer_address", length = 60 )
    private String customerAddress;

    public Customer(){}

    public Customer(String customerName, String customerAddress, int mobile) {
        this.customerName = customerName;

        this.customerAddress = customerAddress;
        this.mobile = mobile;
    }

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
}
