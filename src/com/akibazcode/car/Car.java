package com.akibazcode.car;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Car {
    private String regNumber;
    private BigDecimal rentalPricePerDay;
    private CarBrand carBrand;
    private boolean isElectric;
    private boolean isAvailable;

    public Car(String regNumber, double rentalPricePerDay, CarBrand brand, boolean isElectric) {
        this.regNumber = regNumber;
        this.rentalPricePerDay = new BigDecimal(rentalPricePerDay);
        this.rentalPricePerDay = this.rentalPricePerDay.setScale(2, RoundingMode.HALF_UP);
        this.carBrand = brand;
        this.isElectric = isElectric;
        this.isAvailable = true;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public BigDecimal getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(BigDecimal rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", rentalPricePerDay=" + rentalPricePerDay +
                ", brand=" + carBrand +
                ", isElectric=" + isElectric +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isElectric == car.isElectric && isAvailable == car.isAvailable && Objects.equals(regNumber, car.regNumber) && Objects.equals(rentalPricePerDay, car.rentalPricePerDay) && carBrand == car.carBrand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, rentalPricePerDay, carBrand, isElectric, isAvailable);
    }
}
