package io.codelex.ClassTest14_06.Exercise1;

public class Main {
    public static void main(String[] args) throws NotEnoughFundsException {
        CreditCard credit = new CreditCard("123456789", "Richard Rossmann", "076", 1478.99);
        DebitCard debit = new DebitCard("987654321", "Mahila Jaffa", "054", 99.15);

        credit.takeMoney(1400);
        credit.addMoney(100);
        System.out.println(credit.getBalance());

        System.out.println();
        debit.addMoney(1000);
        debit.addMoney(10000);
        System.out.println(debit.getBalance());
        debit.takeMoney(12000);
        System.out.println(debit.getBalance());
    }
}
