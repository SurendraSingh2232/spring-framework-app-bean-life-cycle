package com.sunglowsys.domain;

import java.util.Objects;

public class RatePlane {
    private Integer id;
    private String name;
    private Integer hotelId;
    private Integer roomtypeId;

    public RatePlane(){
        System.out.println("Rateplan object created");
    }

    public RatePlane(String name, Integer hotelId, Integer roomtypeId) {
        this.name = name;
        this.hotelId = hotelId;
        this.roomtypeId = roomtypeId;
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

    public Integer getRoomtypeId() {
        return roomtypeId;
    }

    public void setRoomtypeId(Integer roomtypeId) {
        this.roomtypeId = roomtypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatePlane ratePlane = (RatePlane) o;
        return Objects.equals(id, ratePlane.id) && Objects.equals(name, ratePlane.name) && Objects.equals(hotelId, ratePlane.hotelId) && Objects.equals(roomtypeId, ratePlane.roomtypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hotelId, roomtypeId);
    }

    @Override
    public String toString() {
        return "RatePlane{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hotelId=" + hotelId +
                ", roomtypeId=" + roomtypeId +
                '}';
    }
}
