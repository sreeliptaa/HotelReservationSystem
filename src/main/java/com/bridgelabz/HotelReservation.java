package com.bridgelabz;

/**
 * Purpose - To build a Hotel Reservation System
 * Author - Sreelipta
 * @since - 2021-09-23
 */

public class HotelReservation {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");
    }

    /**
     * Method to add Hotel in a Hotel Reservation System with Name and rates for Regular Customer
     *
     * @param hotelName   - hotel name is first argument
     * @param weekdayRate - weekday rate of hotel is second argument
     * @return the hotel details as hotel name , weekday rate
     */

    public Hotel addHotel(String hotelName, int weekdayRate) {
        return new Hotel(hotelName, weekdayRate);
    }
}
