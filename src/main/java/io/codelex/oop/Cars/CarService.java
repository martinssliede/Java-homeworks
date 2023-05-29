package io.codelex.oop.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private ArrayList<String> carList = new ArrayList<>();

    public void addCar(Car car) {
        carList.add(String.valueOf(car));
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public ArrayList<String> getAllCars() {
        return carList;
    }

//    public List<Car> getV12() {
//        List<Car> v12 = new ArrayList<>();
//        for (String car : carList) {
//
//        }
//    }
}
