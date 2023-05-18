package io.codelex.classesandobjects.practice.Exercise7;

public class Dog_Test {
    public static void main(String[] args) {

    Dog max = new Dog("Max", "male", "Lady", "Rocky");
    Dog rocky = new Dog("Rocky", "male", "Molly", "Sam");
    Dog sparky = new Dog("Sparky", "male");
    Dog buster = new Dog("Buster", "male", "Lady", "Sparky");
    Dog sam = new Dog("Sam", "male");
    Dog lady = new Dog("Lady", "female");
    Dog molly = new Dog("Molly", "female");
    Dog coco = new Dog("Coco", "female", "Molly", "Buster");

    System.out.println("Fathers name: " + coco.fathersName());
    System.out.println("Fathers name: " + sparky.fathersName());

    System.out.println("Coco has the same mother as Rocky? " + coco.hasSameMotherAs(rocky));

    }
}
