package com.sunglowsys.domain;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Objects;

public class Hotel {
    private Integer id;
    private String code;
    private String name;
    private String hotelType;
    private String email;
    private String mobile;
    private Integer addressId;

    public Hotel(){
        System.out.println("Hotel object created");
    }

    public Hotel(String code, String name, String hotelType, String email, String mobile, Integer addressId) {
        this.code = code;
        this.name = name;
        this.hotelType = hotelType;
        this.email = email;
        this.mobile = mobile;
        this.addressId = addressId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(id, hotel.id) && Objects.equals(code, hotel.code) && Objects.equals(name, hotel.name) && Objects.equals(hotelType, hotel.hotelType) && Objects.equals(email, hotel.email) && Objects.equals(mobile, hotel.mobile) && Objects.equals(addressId, hotel.addressId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, hotelType, email, mobile, addressId);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", hotelType='" + hotelType + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", addressId=" + addressId +
                '}';
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy the object");
    }

    @PostConstruct
    public void init(){
        System.out.println("Ready to use the object");
    }
}
