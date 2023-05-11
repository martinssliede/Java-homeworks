package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;


public class Exercise9_RollTwoDice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input the desired sum: ");
        int sum = scanner.nextInt();
        int roll1;
        int roll2;
        int total = 0;

        while (sum != total) {
            roll1 = random.nextInt(1, 7);
            roll2 = random.nextInt(1, 7);
            total = roll1 + roll2;
            System.out.printf("%d and %d = %d\n", roll1, roll2, total);
        }
    }
}
