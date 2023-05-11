package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise6_FizzBuzz {

    public static void main(String[] args) {
        // Izveido skaneri un dialogu;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int maxValue = scanner.nextInt();

        for (int i = 1; i <= maxValue; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // Lai viss printētots vienā rindā - .print()
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
            // Pārceļ jaunā rindā ar .println(); atdalošais skaitlis - 11;
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
