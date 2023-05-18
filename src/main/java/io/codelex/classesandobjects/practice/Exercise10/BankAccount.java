package io.codelex.classesandobjects.practice.Exercise10;

// Each BankAccount object represents one user's account
// information including name and balance of money.

import java.text.DecimalFormat;

public class BankAccount {
    public String name;
    public double balance;

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (balance > 0) {
        return (name + ", $" + decimalFormat.format(balance));
    } else {
        return (name + ", -$" + decimalFormat.format(Math.abs(balance)));
        }
    }

    public final void deposit(double amount) {
        balance += amount;
        //todo
    }

    public final void withdraw(double amount) {
        balance -= amount;
        //todo
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
}
