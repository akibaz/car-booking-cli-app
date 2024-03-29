package com.akibazcode;

import com.akibazcode.booking.BookingService;
import com.akibazcode.car.CarBrand;
import com.akibazcode.car.CarService;
import com.akibazcode.user.UserService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput ;

        //Add users to record
        UserService.addUser("Baki");
        UserService.addUser("Maki");

        // Add cars to record
        CarService.addCar("1234", 89.00, CarBrand.TESLA, true);
        CarService.addCar("5678", 50.00, CarBrand.AUDI, false);
        CarService.addCar("9101", 77.00, CarBrand.MERCEDES, false);
        do {
            System.out.println(
            """
                    
                    1 - Book Car
                    2 - View All User Booked Cars
                    3 - View All Bookings
                    4 - View Available Cars
                    5 - View Available Electric Cars
                    6 - View All Users
                    7 - Exit
                    """
            );

            userInput = validateUserInput(scanner);

            if (userInput == 1) {
                BookingService.bookCar();
            } else if (userInput == 2) {
                BookingService.viewBookedCarsByUserId();
            }
            if (userInput == 3) {
                BookingService.printBookings();
            } else if (userInput == 4) {
                CarService.printAvailableCars();
            } else if (userInput == 5) {
                CarService.printAvailableElectricCars();
            } else if (userInput == 6) {
                UserService.printUsers();
            }
        } while (userInput != 7);
    }

    private static int validateUserInput(Scanner scanner) {
        int userInput = 0;
        try {
            userInput = scanner.nextInt();
            if (userInput < 1 || userInput > 7) {
                System.out.println(userInput + " is not a valid option ❌");
                return 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please insert a number from 1 to 7.");
            scanner.next();
        }
        return userInput;
    }
}
