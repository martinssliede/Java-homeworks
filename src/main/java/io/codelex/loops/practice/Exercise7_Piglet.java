package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;


public class Exercise7_Piglet {

    public static void main(String[] args) {
        // Izveido skaneri;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean rollAgain = true;

        System.out.println("Welcome to Piglet!");

        while (rollAgain) {
            int turn = random.nextInt(1, 7);
            System.out.println("You rolled a: " + turn);

            if (turn == 1) {
                score = 0;
                System.out.println("You rolled 1, and got 0 points.");
                break;
            } else {
                score += turn;
                System.out.println("Your score is: " + score + " Roll again? Reply with y or n");
                rollAgain = readAnswer(scanner);
            }
        }

        System.out.println("You got " + score + " points!");
    }

    private static boolean readAnswer(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("y")) {
                return true;
            } else if (input.equals("n")) {
                return false;
            }
        }
    }
}
