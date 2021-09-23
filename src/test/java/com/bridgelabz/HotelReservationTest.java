package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();
    Hotel detailOfHotel1 = hotelReservation.addHotel("Lakewood", 110);
    Hotel detailOfHotel2 = hotelReservation.addHotel("Bridgewood", 160);
    Hotel detailOfHotel3 = hotelReservation.addHotel("Ridgewood", 220);

    @Test
    void whenAddedHotelName_ShouldReturn_EnteredHotelName() {
        Assertions.assertEquals(detailOfHotel1.getHotelName(), "Lakewood");
        Assertions.assertEquals(detailOfHotel2.getHotelName(), "Bridgewood");
        Assertions.assertEquals(detailOfHotel3.getHotelName(), "Ridgewood");

    }

    @Test
    void whenAddedWeekdayRate_ShouldReturn_EnteredWeekdayRate() {
        Assertions.assertEquals(detailOfHotel1.getWeekdayRate(), 110);
        Assertions.assertEquals(detailOfHotel2.getWeekdayRate(), 160);
        Assertions.assertEquals(detailOfHotel3.getWeekdayRate(), 220);

    }

}
