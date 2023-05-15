package io.codelex.classesandobjects.practice;

public class Exercise7_DogTest {
    public static void main(String[] args) {

    Exercise7_Dog max = new Exercise7_Dog("Max", "male", "Lady", "Rocky");
    Exercise7_Dog rocky = new Exercise7_Dog("Rocky", "male", "Molly", "Sam");
    Exercise7_Dog sparky = new Exercise7_Dog("Sparky", "male");
    Exercise7_Dog buster = new Exercise7_Dog("Buster", "male", "Lady", "Sparky");
    Exercise7_Dog sam = new Exercise7_Dog("Sam", "male");
    Exercise7_Dog lady = new Exercise7_Dog("Lady", "female");
    Exercise7_Dog molly = new Exercise7_Dog("Molly", "female");
    Exercise7_Dog coco = new Exercise7_Dog("Coco", "female", "Molly", "Buster");

    System.out.println("Fathers name: " + coco.fathersName());
    System.out.println("Fathers name: " + sparky.fathersName());

    System.out.println("Coco has the same mother as Rocky? " + coco.hasSameMotherAs(rocky));

    }
}
