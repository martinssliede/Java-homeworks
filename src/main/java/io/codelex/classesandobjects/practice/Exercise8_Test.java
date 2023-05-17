package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class Exercise8_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The amount of money in the account: ");
        double startingBalance = scanner.nextDouble();
        System.out.println("Annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.println("Number of months the account is open: ");
        int months = scanner.nextInt();


        for (int i = 0; i < months; i++) {
            System.out.println("Enter amount deposited for month " + i);
            int deposited = scanner.nextInt();
            System.out.println("Enter amount withdrawn for month " + i);
            int withdrawn = scanner.nextInt();
        }

        // Use the class method to calculate the monthly interest. After the last iteration, the program should display the ending balance, the total amount of deposits, the total amount of withdrawals, and the total interest earned.



    }
}
