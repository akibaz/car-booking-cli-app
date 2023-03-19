package com.akibazcode.car;

public class CarService {

    public static void addCar(String regNumber, double rentalPrice, CarBrand brand, boolean isElectric) {
        Car car = new Car(regNumber, rentalPrice, brand, isElectric);
        CarDAO.addCar(car);
    }

    public static void printAvailableCars() {
        Car[] cars = CarDAO.getCars();
        int availableCars = 0;
        for (Car car : cars) {
            if (car != null && car.isAvailable()) {
                System.out.println(car);
                availableCars++;
            } else if (car == null) {
                break;
            }
        }
        if (availableCars == 0) {
            System.out.println("There are no available cars ❌");
        }
    }

    public static void printAvailableElectricCars() {
        Car[] cars = CarDAO.getCars();
        int counter = 0;
        for (Car car : cars) {
            if (car != null && car.isElectric() && car.isAvailable()) {
                counter++;
            } else if (car == null) {
                break;
            }
        }
        Car[] availableElectricCars = new Car[counter];
        counter = 0;
        for (Car car : cars) {
            if (car != null && car.isElectric() && car.isAvailable()) {
                availableElectricCars[counter++] = car;
            } else if (car == null) {
                break;
            }
        }

        if (availableElectricCars.length == 0) {
            System.out.println("There are no available electric cars ❌");
        } else {
            for (Car availableElectricCar : availableElectricCars) {
                System.out.println(availableElectricCar);
            }
        }
    }

    public static Car validateCarByRegNumber(String regNumber) {
        Car[] cars = CarDAO.getCars();
        for (Car car : cars) {
            if (car == null) {
                System.out.println("There is no car with that reg number ❌");
                return null;
            } else if (car.getRegNumber().equals(regNumber)) {
                return car;
            }
        }
        return null;
    }

    public static boolean isThereAvailableCar() {
        Car[] cars = CarDAO.getCars();
        boolean isAvailable = false;
        for (Car car : cars) {
            if (car != null && car.isAvailable()) {
                isAvailable = true;
                return isAvailable;
            } else if (car == null) {
                break;
            }
        }
        return isAvailable;
    }
}
