package io.codelex.classesandobjects.practice.Exercise1;

public class Exercise1_Program {
    public static void main(String[] args) {

        Exercise1_Product item1 = new Exercise1_Product("Logitech mouse", 70.00, 14);
        Exercise1_Product item2 = new Exercise1_Product("iPhone 5s", 999.99, 3);
        Exercise1_Product item3 = new Exercise1_Product("Epson EB-U05", 440.46, 1);

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println();

        item1.setAmountAtStart(9);
        item2.setPriceAtStart(299.99);

        System.out.println("After changes: ");
        item1.printProduct();
        item2.printProduct();
        item3.printProduct();
    }
}
