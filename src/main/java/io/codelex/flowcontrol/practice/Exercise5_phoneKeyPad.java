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
                case 'a':
                case 'b':
                case 'c':
                    result += "2";
                    break;
                case 'd':
                case 'e':
                case 'f':
                    result += "3";
                    break;
                case 'g':
                case 'h':
                case 'i':
                    result += "4";
                    break;
                case 'j':
                case 'k':
                case 'l':
                    result += "5";
                    break;
                case 'm':
                case 'n':
                case 'o':
                    result += "6";
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    result += "7";
                    break;
                case 't':
                case 'u':
                case 'v':
                    result += "8";
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    result += "9";
                    break;
            }
        }
        System.out.println("Text converted to keypad digits: " + result);
    }
}
