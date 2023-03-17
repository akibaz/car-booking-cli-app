package com.akibazcode.car;

public class CarService {

    public static void addCar(String regNumber, double rentalPrice, CarBrand brand, boolean isElectric) {
        Car car = new Car(regNumber, rentalPrice, brand, isElectric);
        CarDAO.addCar(car);
    }

    public static void printAvailableCars() {
        Car[] cars = CarDAO.getCars();
        for (Car car : cars) {
            if (car != null && car.isAvailable()) {
                System.out.println(car);
            } else if (car == null) {
                break;
            }
        }
    }

    public static void printAvailableElectricCars() {
        Car[] cars = CarDAO.getCars();
        for (Car car : cars) {
            if (car != null && car.isAvailable() && car.isElectric()) {
                System.out.println(car);
            } else if (car == null) {
                System.out.println("There are no available electric cars ❌");
                break;
            }
        }
    }

    public static Car validateCarByRegNumber(String regNumber) {
        Car[] cars = CarDAO.getCars();
        for (Car car : cars) {
            if (car == null) {
                System.out.println("There are i no car with that reg number ❌");
                return null;
            } else if (car.getRegNumber().equals(regNumber)) {
                return car;
            }
        }
        return null;
    }
}
