package io.codelex.enums.practice.Exercise2;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final String[] CHOICES = {"SCISSOR", "PAPER", "STONE"};
    private static final String[] OUTCOMES = {"Tie!", "User won!", "Computer won!"};

    public static void main(String[] args) {
        int userWins = 0;
        int computerWins = 0;
        int gameCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let us begin...");
        System.out.println("Scissor-Paper-Stone");

        while (true) {
            System.out.println("\tYour turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("q")) {
                break;
            }
            if (!input.matches("[spt]")) {
                System.out.println("Invalid input, try again...");
                continue;
            }

            switch (input) {
                case "s":
                    gameCount++;
                    Choice computerChoice = getRandomChoice();
                    System.out.println("\tComputer turn: " + CHOICES[computerChoice.ordinal()]);
                    String result = getResult(Choice.SCISSOR, computerChoice);
                    System.out.println(result);
                    if (result.equals(OUTCOMES[1])) {
                        userWins++;
                    } else if (result.equals(OUTCOMES[2])) {
                        computerWins++;
                    }
                    break;
                case "p":
                    gameCount++;
                    computerChoice = getRandomChoice();
                    System.out.println("\tComputer turn: " + CHOICES[computerChoice.ordinal()]);
                    result = getResult(Choice.PAPER, computerChoice);
                    System.out.println(result);
                    if (result.equals(OUTCOMES[1])) {
                        userWins++;
                    } else if (result.equals(OUTCOMES[2])) {
                        computerWins++;
                    }
                    break;
                case "t":
                    gameCount++;
                    computerChoice = getRandomChoice();
                    System.out.println("\tComputer turn: " + CHOICES[computerChoice.ordinal()]);
                    result = getResult(Choice.STONE, computerChoice);
                    System.out.println(result);
                    if (result.equals(OUTCOMES[1])) {
                        userWins++;
                    } else if (result.equals(OUTCOMES[2])) {
                        computerWins++;
                    }
                    break;
                default:
                    System.out.println("\tInvalid input, try again...");
                }
            }
        System.out.println("Number of games played: " + gameCount);
        System.out.printf("Computer won %d(%.2f%%). User won %d(%.2f%%).", computerWins, (computerWins / (double) gameCount) * 100, userWins, (userWins / (double) gameCount) * 100);
        System.out.println("Bye!");
        }

    public static Choice getRandomChoice() {
        int randomIndex = (int) (Math.random() * Choice.values().length);
        return Choice.values()[randomIndex];
    }

    public static String getResult(Choice userChoice, Choice computerChoice) {
        if (userChoice == computerChoice) {
            return OUTCOMES[0];
        } else if ((userChoice == Choice.SCISSOR && computerChoice == Choice.PAPER) ||
                    (userChoice == Choice.PAPER && computerChoice == Choice.STONE) ||
                    (userChoice == Choice.STONE && computerChoice == Choice.SCISSOR)) {
            return OUTCOMES[1];
        } else {
            return OUTCOMES[2];
        }
    }

}
