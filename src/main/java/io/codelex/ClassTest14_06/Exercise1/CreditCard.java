package io.codelex.ClassTest14_06.Exercise1;

public class CreditCard extends Card{
    public CreditCard(String cardNumber, String ownersFullName, String CCV, double balance) {
        super(cardNumber, ownersFullName, CCV, balance);
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        if (getBalance() >= amount) {
            double newBalance = getBalance() - amount;
            if (newBalance < 100) {
                System.out.println("Warning: Low funds");
            }
            super.balance = newBalance;
        } else {
            throw new NotEnoughFundsException("Insufficient funds for this operation!");
        }
    }
}
