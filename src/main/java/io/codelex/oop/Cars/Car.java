package io.codelex.oop.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private double price;
    private int yearOfManufacture;

    public Car(String name, String model, double price, int yearOfManufacture) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
    }

    List<String> Manufacturer = new ArrayList<String>();

    // Kā jāpievieno engineType enums?


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && yearOfManufacture == car.yearOfManufacture && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(Manufacturer, car.Manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, Manufacturer);
    }
}
