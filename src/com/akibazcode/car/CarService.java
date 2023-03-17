package com.akibazcode.car;

public class CarService {

    public static void addCar(String regNumber, double rentalPrice, CarBrand brand, boolean isElectric) {
        Car car = new Car(regNumber, rentalPrice, brand, isElectric);
        CarDAO.addCar(car);
    }

    public static Car[] getAvailableCars() {
        Car[] cars = CarDAO.getCars();
        int counter = 0;
        for (Car car : cars) {
            if (car != null && car.isAvailable()) {
                counter++;
            } else {
                break;
            }
        }
        Car[] availableCars = new Car[counter];
        int index = 0;
        for (Car car : cars) {
            if (car != null && car.isAvailable()) {
                availableCars[index++] = car;
            }
        }
        return availableCars;
    }

    public static Car[] getAvailableElectricCars() {
        Car[] cars = CarDAO.getCars();
        int counter = 0;
        for (Car car : cars) {
            if (car != null && car.isAvailable() && car.isElectric()) {
                counter++;
            } else {
                break;
            }
        }
        Car[] availableElectricCars = new Car[counter];
        int index = 0;
        for (Car car : cars) {
            if (car != null && car.isAvailable() && car.isElectric()) {
                availableElectricCars[index++] = car;
            }
        }
        return availableElectricCars;
    }
}
