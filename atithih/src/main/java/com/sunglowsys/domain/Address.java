package com.sunglowsys.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Objects;
@Component
public class Address {
    private Integer id;
    private  String addressLine1;
    private String getAddressLine2;
    private String street;
    private String state;
    private String country;
    private String zipcode;

    public Address(){
        System.out.println("Address object created");
    }

    public Address(String addressLine1, String getAddressLine2, String street, String state, String country, String zipcode) {
        this.addressLine1 = addressLine1;
        this.getAddressLine2 = getAddressLine2;
        this.street = street;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public Integer getId() {
        return id;
    }
    @Value("12")
    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }
    @Value("Khurrampur")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getGetAddressLine2() {
        return getAddressLine2;
    }

    @Value("Mohanpura")
    public void setGetAddressLine2(String getAddressLine2) {
        this.getAddressLine2 = getAddressLine2;
    }

    public String getStreet() {
        return street;
    }

    @Value("mohanpura road ")
    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    @Value("Uttar Pradesh")
    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    @Value("India")
    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    @Value("207123")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(addressLine1, address.addressLine1) && Objects.equals(getAddressLine2, address.getAddressLine2) && Objects.equals(street, address.street) && Objects.equals(state, address.state) && Objects.equals(country, address.country) && Objects.equals(zipcode, address.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressLine1, getAddressLine2, street, state, country, zipcode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressLine1='" + addressLine1 + '\'' +
                ", getAddressLine2='" + getAddressLine2 + '\'' +
                ", street='" + street + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
    @PostConstruct
    public void init(){
        System.out.println("Ready to use the object");

    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy the object");
    }
}
