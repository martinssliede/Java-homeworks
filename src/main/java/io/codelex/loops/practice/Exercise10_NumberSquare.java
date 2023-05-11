package io.codelex.loops.practice;

import java.util.Scanner;


public class Exercise10_NumberSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input min number: ");
        int min = scanner.nextInt();
        System.out.println("Input max number: ");
        int max = scanner.nextInt();

        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int j = min; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
