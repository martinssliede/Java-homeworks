package io.codelex.typesandvariables.practice;
// Aktivizē lietotāja input opciju

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        // Izveido jaunu scanner
        Scanner scanner = new Scanner(System.in);
        // Izveido dialogu
        System.out.print("Enter the distance in meters: ");
        // Pieņem double tipa inputus;
        double distance = scanner.nextDouble();

        System.out.print("Enter the time taken in hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter the time taken in minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter the time taken in seconds: ");
        int seconds = scanner.nextInt();

        // Kopējais laiks sekundēs
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        // Aprēķina metrus sekundē
        double metersPerSecond = distance / totalSeconds;
        // Aprēķina kilometrus stundā
        double kilometersPerHour = (distance / 1000) / ((double) totalSeconds / 3600);
        // Aprēķina jūdzes stundā
        double milesPerHour = (distance / 1609) / ((double) totalSeconds / 3600);

        System.out.println("Distance in meters: " + distance);
        System.out.println("Time in hours: " + hours);
        System.out.println("Time in minutes: " + minutes);
        System.out.println("Time in seconds: " + seconds);
        System.out.println("Your speed in m/s: " + metersPerSecond);
        System.out.println("Your speed in km/h: " + kilometersPerHour);
        System.out.println("Your speed in miles/h: " + milesPerHour);
    }
}
