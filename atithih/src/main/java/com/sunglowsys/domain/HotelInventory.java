package com.sunglowsys.domain;

import java.util.Objects;

public class HotelInventory {
    private Integer id;
    private String totalInventory;
    private Integer hotelId;
    private Integer roomtypeId;

    public HotelInventory(){
        System.out.println("HotelInventory object created");
    }

    public HotelInventory(String totalInventory, Integer hotelId, Integer roomtypeId) {
        this.totalInventory = totalInventory;
        this.hotelId = hotelId;
        this.roomtypeId = roomtypeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTotalInventory() {
        return totalInventory;
    }

    public void setTotalInventory(String totalInventory) {
        this.totalInventory = totalInventory;
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
        HotelInventory that = (HotelInventory) o;
        return Objects.equals(id, that.id) && Objects.equals(totalInventory, that.totalInventory) && Objects.equals(hotelId, that.hotelId) && Objects.equals(roomtypeId, that.roomtypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, totalInventory, hotelId, roomtypeId);
    }

    @Override
    public String toString() {
        return "HotelInventory{" +
                "id=" + id +
                ", totalInventory='" + totalInventory + '\'' +
                ", hotelId=" + hotelId +
                ", roomtypeId=" + roomtypeId +
                '}';
    }
}
