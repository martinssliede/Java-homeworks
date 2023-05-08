package io.codelex.typesandvariables.practice;
// Aktivizē lietotāja input opciju

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        // Izveido jaunu scanner
        Scanner scanner = new Scanner(System.in);
        // Izveido dialogu
        System.out.print("Enter a series of single digit numbers (without spaces): ");
        // Pieņem String tipa inputus;
        String input = scanner.nextLine();

        int sum = 0;

        // Atradu šādu risinājumu, bet līdz galam nesaprotu kā tas strādā, varbūt ir kāda alternatīva?
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int digit = c - '0';
            sum += digit;
        }

        System.out.println("The sum of the entered numbers is: " + sum);
    }
}
