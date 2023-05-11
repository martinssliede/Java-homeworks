package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        // Izveido skaneri un abus dialogus;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        // Iegūst nepieciešamo punktu daudzumu atņemot abus vārdus;
        int numberOfDots = 30 - word1.length() - word2.length();
        // Izveido mainīgo kur saglabāt punktu skaitu;
        String dots = "";

        // Izveido punktu skaitu starpības daudzumā;
        for (int i = 0; i < numberOfDots; i++) {
            dots += ".";
        }
        System.out.println(word1 + dots + word2);
    }
}
