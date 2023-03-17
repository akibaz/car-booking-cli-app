package com.akibazcode.booking;

import com.akibazcode.car.Car;

public class BookingService {

    public static void printBookings() {
        Booking[] bookings = BookingDAO.getBookings();
        for (int i = 0; i < bookings.length; i++) {
            if (i == 0 && bookings[i] == null) {
                System.out.println("No bookings available \uD83D\uDE14");
                break;
            } else if (bookings[i] != null) {
                System.out.println(bookings[i]);
            } else {
                break;
            }
        }
    }
}
