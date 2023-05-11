package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise1 {

    //TODO: Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {

        int[] myArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String[] myArray2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        System.out.println("Original numeric array : ");
        for (int i :
                myArray1) {
            System.out.print(i + " ");
        }
        Arrays.sort(myArray1);
        System.out.println("\nSorted numeric array : ");
        for (int i :
                myArray1) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("\nOriginal string array : ");
        for (String s :
                myArray2) {
            System.out.print(s + " ");
        }
        Arrays.sort(myArray2);
        System.out.println("\nSorted string array : ");
        for (String s :
                myArray2) {
            System.out.print(s + " ");
        }

        /*
        fixme
        System.out.println("Original numeric array : " + .........);
        ........... //Sort array
        System.out.println("Sorted numeric array : " + .........);

        System.out.println("Original string array : " + .........);
        ......... //Sort array
        System.out.println("Sorted string array : " + .........);
        */
    }
}
