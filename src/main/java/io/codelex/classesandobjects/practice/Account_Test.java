package io.codelex.classesandobjects.practice;

public class Account_Test {
    public static void main(String[] args) {
//        Account bartosAccount = new Account("Barto's account",100.00);
//        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);
//
//        System.out.println("Initial state");
//        System.out.println(bartosAccount);
//        System.out.println(bartosSwissAccount);
//
//        bartosAccount.withdrawal(20);
//        System.out.println("Barto's account balance is now: " + bartosAccount.balance());
//        bartosSwissAccount.deposit(200);
//        System.out.println("Barto's Swiss account balance is now: " + bartosSwissAccount.balance());
//
//        System.out.println("Final state");
//        System.out.println(bartosAccount);
//        System.out.println(bartosSwissAccount);

        Account firstAccount = new Account("Martins", 100.0);

        System.out.println("Initial state");
        System.out.println(firstAccount);

        firstAccount.deposit(20.0);
        System.out.println("Martins's account balance is now: " + firstAccount.balance());

        Account matt = new Account("Matt", 1000);
        Account myAccount = new Account("Me", 0);

        System.out.println();
        matt.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(matt);
        System.out.println(myAccount);

        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);

//        a.
    }
}
