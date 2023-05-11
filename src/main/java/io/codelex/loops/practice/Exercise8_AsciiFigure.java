package io.codelex.loops.practice;

import java.util.Scanner;


public class Exercise8_AsciiFigure {

    // PIEDOD, ES NESAPROTU ŠĪ UZDEVUMA LOĢIKU. NEREDZU SAIKNI STARP IEVADĀMĀ LIELUMU, UN SIMBOLU IZKĀRTOJUMU. :(
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the size of figure: ");
        final int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
