package com.bridgelabz;

public class Hotel {
    private String hotelName;
    private int weekdayRate;

    public Hotel(String hotelName, int weekdayRate) {
        this.hotelName = hotelName;
        this.weekdayRate = weekdayRate;
    }

    public String getHotelName() {

        return hotelName;
    }

    public void setHotelName(String HotelName) {

        this.hotelName = hotelName;
    }

    public int getWeekdayRate() {

        return weekdayRate;
    }

    public void setWeekdayRate(int WeekdayRate) {

        this.weekdayRate = weekdayRate;
    }
}
