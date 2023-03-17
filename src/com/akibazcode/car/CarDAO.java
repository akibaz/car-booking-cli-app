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
}
