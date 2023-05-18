package io.codelex.classesandobjects.practice.Exercise2;

import java.util.Scanner;

// JAUTĀJUMS PAR UZD. BEIGĀM;
public class Car_Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers;
        double endKilometers;
        double liters;

        System.out.print("Enter first reading: " );
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: " );
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: " );
        liters  = scan.nextDouble();

        Car car = new Car(startKilometers, endKilometers, liters);


        System.out.println( "Kilometers per liter are "  + car.calculateConsumption());

        // Nesaprotu kā izmanot šos gasHog un economyCar un atlikušās beigas;
        if (car.calculateConsumption() < 5) {
        }
    }
}
