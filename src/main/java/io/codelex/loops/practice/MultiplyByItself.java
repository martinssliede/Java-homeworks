package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int result = 1;
        for (i = 0; i < n; i++) {
            result *= n;
            System.out.println(result);
        }

        /*
        todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (.......) {
          System.out.println(........);
        }
        */
    }

}
