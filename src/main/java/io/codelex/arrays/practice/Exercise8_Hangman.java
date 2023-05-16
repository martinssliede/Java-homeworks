package io.codelex.arrays.practice;

import java.lang.reflect.Array;
import java.util.*;

// Šis tapis ar lielu ChatGPT palīdzību. :D
public class Exercise8_Hangman {
        private static final String[] WORDS = {"geography", "architecture", "dependency", "notification", "hockey", "macbook", "problem"};
        private static final int MAX_TRIES = 6;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = getRandomWord();
        char[] guessedLetters = new char[word.length()];
        Set<Character> missed = new HashSet<>();
        int numTries = 0;

        Arrays.fill(guessedLetters, '_');


        while (numTries < MAX_TRIES) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Word: " + String.valueOf(guessedLetters));
            System.out.println("Tries left: " + (MAX_TRIES - numTries));
            System.out.println("Missed letters: " + missed);

            System.out.println("Enter a letter: ");
            char guess = Character.toLowerCase(input.nextLine().charAt(0));


            boolean found = false;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedLetters[i] = guess;
                    found = true;
                }
            }
            if (!found) {
                missed.add(guess);
                numTries++;
                System.out.println("Incorrect!");
            }
            if (Arrays.equals(guessedLetters, word.toCharArray())) {
                System.out.println("You guessed the word: " + word);
            }
        }
        if (numTries == MAX_TRIES) {
            System.out.println("You ran out of tries. The word was: " + word);
        }
    }
    private static String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(WORDS.length);
        return WORDS[index];
    }
}
