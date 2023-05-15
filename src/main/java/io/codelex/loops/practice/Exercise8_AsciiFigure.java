package io.codelex.loops.practice;

import java.util.Scanner;


public class Exercise8_AsciiFigure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the size of figure: ");
        final int SIZE = scanner.nextInt();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < 4 * (SIZE - i) - 4; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < 8 * i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 4 * (SIZE - i) - 4; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
