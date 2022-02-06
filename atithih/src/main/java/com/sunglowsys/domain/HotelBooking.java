package com.sunglowsys.domain;

import java.util.Date;
import java.util.Objects;

public class HotelBooking {
    private Integer id;
    private Date checkinDate;
    private Date checkOutDate;
    private String totalGuest;
    private Integer noOfNight;
    private Integer noOfRooms;
    private Long bookingAmount;
    private Integer customerId;
    private Integer hotelId;
    private Integer roomTypeID;
    private Integer rateplanId;

    public HotelBooking(){
        System.out.println("HotelBooking object created");
    }

    public HotelBooking(Date checkinDate, Date checkOutDate, String totalGuest, Integer noOfNight, Integer noOfRooms, Long bookingAmount, Integer customerId, Integer hotelId, Integer roomTypeID, Integer rateplanId) {
        this.checkinDate = checkinDate;
        this.checkOutDate = checkOutDate;
        this.totalGuest = totalGuest;
        this.noOfNight = noOfNight;
        this.noOfRooms = noOfRooms;
        this.bookingAmount = bookingAmount;
        this.customerId = customerId;
        this.hotelId = hotelId;
        this.roomTypeID = roomTypeID;
        this.rateplanId = rateplanId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getTotalGuest() {
        return totalGuest;
    }

    public void setTotalGuest(String totalGuest) {
        this.totalGuest = totalGuest;
    }

    public Integer getNoOfNight() {
        return noOfNight;
    }

    public void setNoOfNight(Integer noOfNight) {
        this.noOfNight = noOfNight;
    }

    public Integer getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(Integer noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public Long getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(Long bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getRoomTypeID() {
        return roomTypeID;
    }

    public void setRoomTypeID(Integer roomTypeID) {
        this.roomTypeID = roomTypeID;
    }

    public Integer getRateplanId() {
        return rateplanId;
    }

    public void setRateplanId(Integer rateplanId) {
        this.rateplanId = rateplanId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelBooking that = (HotelBooking) o;
        return Objects.equals(id, that.id) && Objects.equals(checkinDate, that.checkinDate) && Objects.equals(checkOutDate, that.checkOutDate) && Objects.equals(totalGuest, that.totalGuest) && Objects.equals(noOfNight, that.noOfNight) && Objects.equals(noOfRooms, that.noOfRooms) && Objects.equals(bookingAmount, that.bookingAmount) && Objects.equals(customerId, that.customerId) && Objects.equals(hotelId, that.hotelId) && Objects.equals(roomTypeID, that.roomTypeID) && Objects.equals(rateplanId, that.rateplanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, checkinDate, checkOutDate, totalGuest, noOfNight, noOfRooms, bookingAmount, customerId, hotelId, roomTypeID, rateplanId);
    }

    @Override
    public String toString() {
        return "HotelBooking{" +
                "id=" + id +
                ", checkinDate=" + checkinDate +
                ", checkOutDate=" + checkOutDate +
                ", totalGuest='" + totalGuest + '\'' +
                ", noOfNight=" + noOfNight +
                ", noOfRooms=" + noOfRooms +
                ", bookingAmount=" + bookingAmount +
                ", customerId=" + customerId +
                ", hotelId=" + hotelId +
                ", roomTypeID=" + roomTypeID +
                ", rateplanId=" + rateplanId +
                '}';
    }
}
