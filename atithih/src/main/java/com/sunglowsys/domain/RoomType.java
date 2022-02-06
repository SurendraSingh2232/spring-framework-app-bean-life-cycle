package com.sunglowsys.domain;

import java.util.Objects;

public class RoomType {
    private Integer id;
    private String name;
    private Integer hotelId;

    public RoomType(){
        System.out.println("Roomtype object created");
    }

    public RoomType(String name, Integer hotelId) {
        this.name = name;
        this.hotelId = hotelId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomType roomType = (RoomType) o;
        return Objects.equals(id, roomType.id) && Objects.equals(name, roomType.name) && Objects.equals(hotelId, roomType.hotelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hotelId);
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hotelId=" + hotelId +
                '}';
    }
}
