package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        Audi audi = new Audi("Audi");
        Bmw bmw = new Bmw("BMW");
        Lexus lexus = new Lexus("Lexus");
        Tesla tesla = new Tesla("Tesla");
        Volvo volvo = new Volvo("Volvo");
        Toyota toyota = new Toyota("Toyota");

        carList.add(audi);
        carList.add(bmw);
        carList.add(lexus);
        carList.add(tesla);
        carList.add(volvo);
        carList.add(toyota);

        for (int i = 1; i <= 10; i++) {
            for (Car car : carList) {
                System.out.println("Iteration: " + i + " Speed: " + car.showCurrentSpeed() + " CarList number: " + car);
                car.speedUp();
                if (i == 1) {
                    System.out.print("Engine started    ");
                    car.startEngine();
                }
                if (i == 3) {
                    lexus.useNitrousOxideEngine();
                    toyota.useNitrousOxideEngine();
                }
                if (i == 10) {
                    car.slowDown();
                }
            }
        }


        Optional <Car> fastestCar = carList.stream()
                .max(Comparator.comparingInt(Car::getCurrentSpeed));

        Integer greatestSpeed = carList.stream()
                .mapToInt(v -> Integer.parseInt(v.showCurrentSpeed()))
                .summaryStatistics()
                .getMax();

        fastestCar.ifPresent(car -> System.out.println("Fastest car: " + fastestCar.get() + " with speed: " + greatestSpeed));
    }
}
