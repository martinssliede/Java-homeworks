package io.codelex.typesandvariables.practice;
// Aktivizē lietotāja input opciju

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        // Izveido jaunu scanner
        Scanner scanner = new Scanner(System.in);
        // Izveido dialogu
        System.out.print("Input text: ");
        // Pieņem String tipa inputus;
        String input = scanner.nextLine();

        int count = 0;
        // Cikls pāriet pāri visam input garumam
        for (int i = 0; i < input.length(); i++) {
            // Mainīgais, kurā glabājas katrs input simbols
            char c = input.charAt(i);
            // Lieto metodi uz Character klasi par argumentu ņemot katru simbolu. Ja šis simbols ir lielais burts, pieskaita 1 pie kopējā skaita.
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        System.out.println("The count of uppercase letters: " + count);
    }
}
