package io.codelex.classesandobjects.practice;

public class Exercise8_SavingsAccount {
    private double annualInterestRate;
    private double balance;

    public Exercise8_SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double interest = balance * monthlyInterestRate;
        balance += interest;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }
}
