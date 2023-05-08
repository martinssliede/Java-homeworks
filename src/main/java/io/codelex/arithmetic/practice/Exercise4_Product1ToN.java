package io.codelex.arithmetic.practice;

public class Exercise4_Product1ToN {
    public static void main(String[] args) {
        int sum = 1;
        int factorial = 9;

        for (int i = factorial; i > 0; i--) {
            sum *= i;
        }
        System.out.println("The sum of " + factorial + " is " + sum);
    }
}
