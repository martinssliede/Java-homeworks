package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class Exercise2_LitersPerKilometer {
        public static void main( String[] args )  {
            Scanner scan = new Scanner(System.in);

            double startKilometers, endKilometers, liters;

            System.out.print("Enter first reading: " );
            startKilometers = scan.nextDouble();

            System.out.print("Enter second reading: " );
            endKilometers = scan.nextDouble();

            System.out.print("Enter liters consumed: " );
            liters  = scan.nextDouble();


            Exercise2_Car car1 = new Exercise2_Car(100000, 100123,6.5);
            Exercise2_Car car2 = new Exercise2_Car(100123, 100200,3);

            System.out.println( "Kilometers per liter are "  + car1.calculateConsumption() );
            System.out.println( "Kilometers per liter are "  + car2.calculateConsumption() );

            // Kā izsaukt abas gasHog un economyCar? Vai abī jāapvieno vienā if?
            System.out.println(car1.gasHog());

            // Kaut kur parādās arī miles per gallon. Vajag konvertēt?
        }
}
