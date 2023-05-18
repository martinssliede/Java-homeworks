package io.codelex.classesandobjects.practice.Exercise8;

import java.util.Scanner;
// STRĀDĀ, BET KAUT KĀDA KĻŪDA APRĒĶINOS;
public class Account_Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input annual interest rate: ");
        Double annualInterestRate = scanner.nextDouble();
        System.out.println("Input starting balance: ");
        Double startingBalance = scanner.nextDouble();
        System.out.println("Input months the account is open: ");
        Double months = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(startingBalance);

        for (int i = 1; i <= months; i++) {
            System.out.println("Enter amount deposited for month: " + i + ":");
            savingsAccount.deposit(scanner.nextDouble());
            System.out.println("Enter amount withdrawn for month: " + i + ":");
            savingsAccount.withdraw(scanner.nextDouble());
            savingsAccount.monthlyInterest(annualInterestRate);
        }
        savingsAccount.accountData();
    }
}
