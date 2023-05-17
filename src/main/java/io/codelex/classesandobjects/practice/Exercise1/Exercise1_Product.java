package io.codelex.classesandobjects.practice.Exercise1;

public class Exercise1_Product {
    private String name;
    private double priceAtStart;
    private int amountAtStart;


    public Exercise1_Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }
    public void printProduct() {
        System.out.printf(name + ", price %.2f EUR, " + amountAtStart + " units\n", priceAtStart);
    }

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }

    @Override
    public String toString() {
        return "Exercise1_Product{" +
                "name= '" + name + '\'' +
                ", priceAtStart= " + priceAtStart +
                ", amountAtStart= " + amountAtStart +
                '}';
    }
}

