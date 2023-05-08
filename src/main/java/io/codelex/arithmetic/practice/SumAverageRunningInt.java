package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0;
        int lowerBound = 2;
        int upperBound = 30;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
            average = (float) sum / number;
        }
        System.out.println("The sum of " + lowerBound + " to " + upperBound + " is " + sum);
        System.out.println("The average is " + average);
    }
}
