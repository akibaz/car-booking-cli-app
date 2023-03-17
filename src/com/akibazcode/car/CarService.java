package com.akibazcode.car;

public class CarService {

    public static void addCar(String regNumber, double rentalPrice, CarBrand brand, boolean isElectric) {
        Car car = new Car(regNumber, rentalPrice, brand, isElectric);
        CarDAO.addCar(car);
    }

    public static Car[] getAvailableCars() {
        return CarDAO.getAvailableCars();
    }

    public static Car[] getAvailableElectricCars() {
        return CarDAO.getAvailableElectricCars();
    }
}
