package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to unique word list! \nInput name and press Enter. Leave it blank and press Enter to finish.");
        String name;

        do {
            System.out.println("Input name: ");
            name = scanner.nextLine();

            if (!name.isEmpty()) {
                list.add(name);
            }
        } while (!name.isEmpty());

        System.out.println("Unique name list: " + list);

    }
}
