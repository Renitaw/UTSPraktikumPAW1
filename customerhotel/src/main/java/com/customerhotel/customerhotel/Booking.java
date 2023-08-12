package com.customerhotel.customerhotel;

public class Booking {
    private String checkInDate;
    private String checkOutDate;

    public Booking(String checkInDate, String checkOutDate) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public void displayBookingInfo() {
        System.out.println("Informasi Tamu:");
        System.out.println("Check-in: " + checkInDate);
        System.out.println("Check-out: " + checkOutDate);
    }
}
