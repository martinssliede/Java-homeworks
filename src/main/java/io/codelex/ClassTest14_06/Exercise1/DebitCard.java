package io.codelex.ClassTest14_06.Exercise1;

public class DebitCard extends Card{

    public DebitCard(String cardNumber, String ownersFullName, String CCV, double balance) {
        super(cardNumber, ownersFullName, CCV, balance);
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        if (getBalance() >= amount) {
            super.balance -= amount;
        } else {
            throw new NotEnoughFundsException("Insufficient funds for this operation!");
        }
    }

    @Override
    public void addMoney(double amount) {
        super.addMoney(amount);
        if (getBalance() > 10000) {
            System.out.println("Warning: Too much money");
        }
    }
}
