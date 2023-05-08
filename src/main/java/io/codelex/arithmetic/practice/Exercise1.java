package io.codelex.arithmetic.practice;
// Aktivizē lietotāja input opciju

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Izveido jaunu scanner
        Scanner scanner = new Scanner(System.in);
        // Izveido dialogu
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        boolean result = num1 == 15 || num2 == 15 || num1 + num2 == 15 || num1 - num2 == 15;

        System.out.println(result);
    }
}
