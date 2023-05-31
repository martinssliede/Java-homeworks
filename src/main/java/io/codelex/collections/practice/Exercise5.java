package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isHappy = isHappy(number);

        if (isHappy) {
            System.out.println(number + " is a happy number!");
        } else
            System.out.println(number + " is not a happy number.");
    }

    public static boolean isHappy(int number) {
        HashSet<Integer> list = new HashSet<>();

        while (number != 1 && !list.contains(number)) {
            list.add(number);
            number = calculateSumOfSquares(number);
        }
        return number == 1;
    }

    public static int calculateSumOfSquares(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }
}
