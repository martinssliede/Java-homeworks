package io.codelex.arithmetic.practice;

import java.util.Scanner;
import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(1, 100);
        int guess;

        System.out.println("Guess a random number from 1 to 100. Write it here: ");
        guess = input.nextInt();

        if (guess == randomNumber) {
            System.out.println("Correct! It was " + randomNumber);
        } else if (guess > randomNumber) {
            System.out.println("Too high! I was thinking of " + randomNumber);
        } else {
            System.out.println("Too low! I was thinking of " + randomNumber);
        }
    }
}
