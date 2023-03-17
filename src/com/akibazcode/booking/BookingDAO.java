package com.akibazcode.booking;

public class BookingDAO {
    private static Booking[] bookings;
    private static int nextAvailableIndex = 0;
    private static final int CAPACITY = 100;

    static {
        bookings = new Booking[CAPACITY];
    }

    public static void addBooking(Booking booking) {
        bookings[nextAvailableIndex++] = booking;
    }

    public static Booking[] getBookings() {
        return bookings;
    }
}
