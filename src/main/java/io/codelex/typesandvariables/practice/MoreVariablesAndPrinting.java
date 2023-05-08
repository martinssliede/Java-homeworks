package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name;
        String eyes;
        String teeth;
        String hair;

        int age;
        double height;
        double weight;

        name = "Zed A. Shaw";
        age = 35;
        height = 74 * 2.54;  // centimeters
        weight = 180 * 0.453592; // kilograms
        eyes = "blue";
        teeth = "white";
        hair = "brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + height + " centimeters tall.");
        System.out.printf("He's %.2f kilograms heavy.", weight);
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.printf("If I add " + age + ", %.2f, and %.2f. I get %.2f.", height, weight, age + height + weight);
    }
}