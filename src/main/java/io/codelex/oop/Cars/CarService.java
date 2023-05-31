package io.codelex.oop.Cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
    }
    public void addCar(Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public List<Car> getAllCars() {
        return carList;
    }

    public List<Car> getV12() {
        return carList.stream().filter(car -> car.getEngineType() == EngineType.V12).collect(Collectors.toList());
    }

    public List<Car> getCarsBefore1999(int year) {
        return carList.stream().filter(car -> car.getYearOfManufacture() < year).collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        return carList.stream().max(Comparator.comparingDouble(Car::getPrice)).orElse(null);
    }

    public Car getCheapestCar() {
        return carList.stream().min(Comparator.comparingDouble(Car::getPrice)).orElse(null);
    }

//    public Car getCarWithMultipleManufacturers() {
//        return carList.stream().filter(car -> car.getManufacturer());
//    }

//    public List<Car> getSortedByPrice() {
//
//    }

    public boolean isOnTheList(Car car) {
        return carList.contains(car);
    }

//    public List<Car> getCarsByManufacturer(String manufacturer) {
//        return carList.stream().filter(car -> car.getManufacturer())
//    }


}
