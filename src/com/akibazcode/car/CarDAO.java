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

}
