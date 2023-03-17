package com.akibazcode.car;

class CarDAO {
    private static Car[] cars;
    private static int nextAvailableIndex = 0;
    private static final int CAPACITY = 100;

    static {
        cars = new Car[CAPACITY];
    }

    public static void addCar(Car car) {
        cars[nextAvailableIndex++] = car;
    }

    public static Car[] getCars() {
        return cars;
    }

    public static Car[] getAvailableCars() {
        Car[] availableCars = new Car[nextAvailableIndex];
        int index = 0;
        for (Car car : cars) {
            if (car != null && car.isAvailable()) {
                availableCars[index++] = car;
            }
        }
        return availableCars;
    }

    public static Car[] getAvailableElectricCars() {
        int count = 0;
        for (Car car : cars) {
            if (car != null && car.isElectric() && car.isAvailable()) {
                count++;
            } else {
                break;
            }
        }
        Car[] availableElectricCars = new Car[count];
        int counter = 0;
        for (Car car : cars) {
            if (car != null && car.isElectric() && car.isAvailable()) {
                availableElectricCars[counter++] = car;
            } else {
                break;
            }
        }
        return availableElectricCars;
    }
}
