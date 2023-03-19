package com.akibazcode.booking;

import com.akibazcode.car.Car;
import com.akibazcode.car.CarService;
import com.akibazcode.user.User;
import com.akibazcode.user.UserService;

import java.util.Scanner;
import java.util.UUID;

public class BookingService {

    public static void bookCar() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        User user = null;
        Car car = null;
        do {
            if (!CarService.isThereAvailableCar()) {
                System.out.println("There are no available cars at this moment \uD83D\uDE14");
                return;
            }
            UserService.printUsers();
            System.out.println("➡️ enter user id (enter /exit to exit to main menu)");
            userInput = scanner.nextLine();
            if (userInput.equals("/exit")) {
                return;
            }
            user = UserService.validateUserById(userInput);
        } while (user == null);

        do {
            CarService.printAvailableCars();
            System.out.println("➡️ enter car reg number (enter /exit to exit to main menu)");
            userInput = scanner.nextLine();
            if (userInput.equals("/exit")) {
                return;
            }
            car = CarService.validateCarByRegNumber(userInput);
        } while (car == null);

        Booking booking = new Booking(user.getId(), car.getRegNumber());
        BookingDAO.addBooking(booking);
        car.setAvailable(false);
        System.out.println(user + " successfully booked " + car + ". \uD83D\uDE80");
    }

    public static void viewBookedCarsByUserId() {
        Scanner scanner = new Scanner(System.in);
        User user = null;
        String userInput = "";
        do {
            UserService.printUsers();
            System.out.println("➡️ enter user id (enter /exit to exit to main menu)");
            userInput = scanner.nextLine();
            if (userInput.equals("/exit")) {
                return;
            }
            user = UserService.validateUserById(userInput);
        } while (user == null);

        printBookingByUserId(user.getId());

    }

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

    public static void printBookingByUserId(UUID userId) {
        Booking[] bookings = BookingDAO.getBookings();
        boolean hasBooking = false;
        for (int i = 0; i < bookings.length; i++) {
            if (i == 0 && bookings[i] == null) {
                System.out.println("No bookings available \uD83D\uDE14");
                return;
            } else if (bookings[i] == null && !hasBooking){
                System.out.println("No bookings available \uD83D\uDE14");
                break;
            } else if (bookings[i] == null ){
                break;
            } else if (bookings[i].getUserId().equals(userId)) {
                System.out.println(bookings[i]);
                hasBooking = true;
            }
        }
    }
}
