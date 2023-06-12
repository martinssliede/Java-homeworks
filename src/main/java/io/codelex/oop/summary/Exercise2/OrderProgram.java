package io.codelex.oop.summary.Exercise2;

import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) throws BadFoodException {
        LocalDate bestBefore = LocalDate.of(2023, 6, 13);
        Item milk = new FoodItem("Milk", 0.75, bestBefore);
        Item radio = new ElectronicsItem("Radio", 25.00, 100);
        Item bucket = new HouseholdItem("Bucket", 5.00, "red");


        Order order = new Order();
        order.addItem(milk);
        order.addItem(radio);
        order.addItem(bucket);

        Invoice invoice = new Invoice(order, "INV123");

        System.out.println(invoice.getFormattedInvoice());
    }
}
