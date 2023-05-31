package io.codelex.oop.Computers;

public class Computers_Test {
    public static void main(String[] args) {
        Computer computer1 = new Computer("i5", 16, "GeForce", "Good company", "Acer 3000");

        Computer computer2 = new Computer("i7", 32, "Nvidia", "Best company", "Mac Mini");

        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println();

        System.out.println("Are computer1 and computer2 equal? " + computer1.equals(computer2));

        System.out.println();
        System.out.println("Computer1 hashcode: " + computer1.hashCode());
        System.out.println("Computer2 hashcode: " + computer2.hashCode());

        computer1.setRam(64);
        computer1.setProcessor("i9");
        computer1.setCompany("Digital unlimited");
        System.out.println();
        System.out.println(computer1);

        Laptop laptop1 = new Laptop("i5", 8, "Intel", "Not so good company", "Dell 101", 25000);
        Laptop laptop2 = new Laptop("AMD", 16, "Not included", "Company123", "MacBook Pro", 5000);

        System.out.println();
        System.out.println(laptop1);
        System.out.println(laptop2);

        System.out.println();
        System.out.println("Are laptop1 and laptop2 equal? " + laptop1.equals(laptop2));

        System.out.println();
        System.out.println("Laptop1 hashcode: " + laptop1.hashCode());
        System.out.println("Laptop2 hashcode: " + laptop2.hashCode());

        laptop1.setRam(64);
        laptop1.setProcessor("i9");
        computer1.setCompany("Digital unlimited");
        System.out.println();
        System.out.println(laptop1);
    }
}
