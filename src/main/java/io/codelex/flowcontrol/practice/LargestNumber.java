package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class LargestNumber {

    //TODO: Write a Java program to to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        // Defaultā kā lielāko saglabā pirmo ievadīto;
        int largest = num1;
        // Ja 2. ir lielāks, tad lielākais ir 2.
        if (num2 > largest) {
            largest = num2;
        }
        // Ja 3. ir lielāks, tad lielākais ir 3.
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is " + largest);

        /*
        todo - expected output:
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
         */
    }

}
