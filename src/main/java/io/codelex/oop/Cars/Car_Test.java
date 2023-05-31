package io.codelex.oop.Cars;

public class Car_Test {
    public static void main(String[] args) {

        Manufacturer manufacturer = new Manufacturer("Ford", 1955, "USA");
        Manufacturer manufacturer2 = new Manufacturer("Volvo", 1921, "Sweden");

        Car car = new Car("Volvo", "V90", 34.599, 2021, manufacturer2, EngineType.V6);
        Car car2 = new Car("Ford", "Mustang", 105.500, 1968, manufacturer, EngineType.V8);




    }
}
