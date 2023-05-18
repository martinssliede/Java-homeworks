package io.codelex.classesandobjects.practice.Exercise1;
//DONE
public class Program {
    public static void main(String[] args) {

        Product item1 = new Product("Logitech mouse", 70.00, 14);
        Product item2 = new Product("iPhone 5s", 999.99, 3);
        Product item3 = new Product("Epson EB-U05", 440.46, 1);

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
