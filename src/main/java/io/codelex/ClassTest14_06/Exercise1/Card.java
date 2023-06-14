package io.codelex.ClassTest14_06.Exercise1;

public abstract class Card {
    private String cardNumber;
    private String ownersFullName;
    private String CCV;
    double balance;

    public Card(String cardNumber, String ownersFullName, String CCV, double balance) {
        this.cardNumber = cardNumber;
        this.ownersFullName = ownersFullName;
        this.CCV = CCV;
        this.balance = balance;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public abstract void takeMoney(double amount) throws NotEnoughFundsException;

    public String getCardNumber() {
        return cardNumber;
    }

    public String getOwnersFullName() {
        return ownersFullName;
    }

    public String getCCV() {
        return CCV;
    }

    public double getBalance() {
        return balance;
    }
}
