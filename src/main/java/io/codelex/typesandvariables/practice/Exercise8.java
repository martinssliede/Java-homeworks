package io.codelex.typesandvariables.practice;
// Aktivizē lietotāja input opciju

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // Izveido jaunu scanner
        Scanner scanner = new Scanner(System.in);
        // Izveido dialogu
        System.out.print("Enter the number of minutes: ");
        // Pieņem String tipa inputus;
        long minutes = scanner.nextLong();

        float days = (float) minutes / (60 * 24);
        float years = days / 365;

        System.out.printf("Entered number of minutes is equal to %.3f days and %.5f years.", days, years);
    }
}
