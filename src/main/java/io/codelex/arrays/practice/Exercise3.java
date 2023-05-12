package io.codelex.arrays.practice;

public class Exercise3 {

    //TODO: Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The sum is: " + sum);

        float average = (float) sum / numbers.length;
        System.out.println("Average value of the array elements is: " + average);
        /*
        fixme - calculate sum of all array elements 
        int sum = 0;
        for (?){
            
        }
        */

        /*
        fixme - calculate average value 
        //System.out.println("Average value of the array elements is : " + average);
        */
    }
}
