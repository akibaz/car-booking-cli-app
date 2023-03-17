package com.akibazcode.booking;

import java.util.Objects;
import java.util.UUID;

public class Booking {
    private UUID bookId;
    private UUID userId;
    private String regNumber;

    public Booking(UUID userId, String regNumber) {
        this.userId = userId;
        this.regNumber = regNumber;
        this.bookId = UUID.randomUUID();
    }

    public UUID getBookId() {
        return bookId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookId=" + bookId +
                ", userId=" + userId +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookId, booking.bookId) && Objects.equals(userId, booking.userId) && Objects.equals(regNumber, booking.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, userId, regNumber);
    }
}
