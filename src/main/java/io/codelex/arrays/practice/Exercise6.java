package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {

    public static void main(String[] args) {
        int[] array1 = new int[10];
        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(0, 100);
        }

        int[] array2 = Arrays.copyOf(array1, 10);
        array2[array2.length - 1] = -7;

        System.out.print("Array1: ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Array2: ");
        for (int j : array2) {
            System.out.print(j + " ");
        }
    }
}
