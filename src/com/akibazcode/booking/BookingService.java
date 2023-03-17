package com.akibazcode.booking;

import com.akibazcode.car.Car;
import com.akibazcode.car.CarService;
import com.akibazcode.user.User;
import com.akibazcode.user.UserService;

import java.util.Scanner;

public class BookingService {

    public static void bookCar() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        User user = null;
        Car car = null;
        do {
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
