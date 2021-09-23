package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
     HotelReservation hotelReservation = new HotelReservation();

    @Test
    public void whenAddedHotel_ShouldReturn_AddedHotelDetails() {
        Assertions.assertTrue(hotelReservation.addHotel(new Hotel("LakeWood", 110)));
        Assertions.assertTrue(hotelReservation.addHotel(new Hotel("Bridgewood", 160)));
        Assertions.assertTrue(hotelReservation.addHotel(new Hotel("Ridgewood", 220)));
    }
}
