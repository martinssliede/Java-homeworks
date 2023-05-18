package io.codelex.classesandobjects.practice.Exercise13;

import io.codelex.classesandobjects.practice.Exercise13.Account;
// STRĀDĀ
public class Account_Test {
    public static void main(String[] args) {
        Account firstAccount = new Account("Martins", 100);
        firstAccount.deposit(20);
        System.out.println(firstAccount.balance());

        Account mattsAccount = new Account("Matt", 1000);
        Account myAccount = new Account("Me", 0);
        mattsAccount.withdraw(100);
        myAccount.deposit(100);
        System.out.println(mattsAccount.balance());
        System.out.println(myAccount.balance());

        Account a = new Account("A", 100.0);
        Account b = new Account("B", 0.0);
        Account c = new Account("C", 0.0);

        transfer(a, b, 50.0);
        transfer(b, c, 25.0);

    }
    public static void transfer(Account from, Account to, double howMuch) {
        from.withdraw(howMuch);
        to.deposit(howMuch);
    }
}
