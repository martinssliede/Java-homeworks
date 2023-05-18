package io.codelex.classesandobjects.practice.Exercise8;

public class SavingsAccount {
    private double annualInterestRate;
    private double startingBalance;
    private double withdrawn;
    private double deposited;
    private double interestEarned;

    public SavingsAccount(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    public void withdraw(double amount) {
        withdrawn += amount;
    }
    public void deposit(double amount) {
        deposited += amount;
    }

    public void monthlyInterest(double annualInterestRate) {
        double monthlyInterest = ((annualInterestRate / 12) / 100) * startingBalance;
        double interest = monthlyInterest * startingBalance;
        interestEarned += interest;
    }

    public double endingBalance() {
        return startingBalance + deposited - withdrawn + interestEarned;
    }
    public void accountData() {
        System.out.printf("Total deposited: $%.2f\n", deposited);
        System.out.printf("Total withdrawn: $%.2f\n", withdrawn);
        System.out.printf("Total interest earned: $%.2f\n", interestEarned);
        System.out.printf("Ending balance: $%.2f\n", endingBalance());
    }
}
