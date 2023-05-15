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

        Exercise8_SavingsAccount savingsAccount = new Exercise8_SavingsAccount(1000);



    }
}
