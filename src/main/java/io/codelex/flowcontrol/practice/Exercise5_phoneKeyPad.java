package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class Exercise5_phoneKeyPad {
    public static void main(String[] args) {
        // Izveido jaunu scanner
        Scanner scanner = new Scanner(System.in);
        // Izveido dialogu
        System.out.print("Enter a String to be converted: ");
        // Uzreiz pārveido uz mazajiem burtiem
        String input = scanner.nextLine().toLowerCase();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);

            switch (letter) {
                case 'a', 'b', 'c' -> result += "2";
                case 'd', 'e', 'f' -> result += "3";
                case 'g', 'h', 'i' -> result += "4";
                case 'j', 'k', 'l' -> result += "5";
                case 'm', 'n', 'o' -> result += "6";
                case 'p', 'q', 'r', 's' -> result += "7";
                case 't', 'u', 'v' -> result += "8";
                case 'w', 'x', 'y', 'z' -> result += "9";
            }
        }
        System.out.println("Text converted to keypad digits: " + result);
    }
}
