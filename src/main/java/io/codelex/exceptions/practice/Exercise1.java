package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter values or 'quit' to end the program.");
            System.out.println("Enter the numerator: ");
            String numeratorInput = scanner.nextLine();

            if (numeratorInput.toLowerCase().startsWith("q")) {
                break;
            }
            try {
                int numerator = Integer.parseInt(numeratorInput);
                System.out.println("Enter the divisor: ");
                int divisor = scanner.nextInt();
                scanner.nextLine();
                int result = numerator / divisor;
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (ArithmeticException a) {
                System.out.println("You can't divide " + numeratorInput + " by 0!");
            } catch (NumberFormatException a) {
                System.out.println("You entered bad data, please try again!");
            }
        }
    }
}
