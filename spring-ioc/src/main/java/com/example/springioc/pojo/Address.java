package com.example.springioc.pojo;

public class Address {
    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    public Address(String address) {
        this.address = address;
    }
    public Address() {
    }
}
