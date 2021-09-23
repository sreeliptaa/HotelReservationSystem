package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

/**
 * Purpose - To build a Hotel Reservation System
 * Author - Sreelipta
 * @since - 2021-09-23
 */

public class HotelReservation {
    private List<Hotel> hotels;

    public HotelReservation() {
        this.hotels = new ArrayList<>();
    }

    /**
     * This method is used to add hotel to the Hotel List
     */
    public boolean addHotel(Hotel hotel) {
        return this.hotels.add(hotel);
    }
}

