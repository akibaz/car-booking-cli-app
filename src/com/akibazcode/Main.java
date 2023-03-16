package com.akibazcode;

import com.akibazcode.user.User;
import com.akibazcode.user.UserService;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput ;
        User baki = new User("Baki");
        User maki = new User("Maki");
        UserService.insertUser(baki);
        UserService.insertUser(maki);
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

            if (userInput == 6) {
                printUsers();
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

    private static void printUsers() {
        User[] users = UserService.getUsers();
        for (User user : users) {
            if (user == null) {
                break;
            } else {
                System.out.println(user);
            }
        }
    }
}
