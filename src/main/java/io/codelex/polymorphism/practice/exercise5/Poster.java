package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert{
    private String dimensions;
    private int numberOfCopies;
    private double costPerCopy;

    public Poster(String dimensions, int numberOfCopies, double costPerCopy) {
        this.dimensions = dimensions;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public int cost() {
        return (int) (fee + numberOfCopies * costPerCopy);
    }

    public String toString() {
        return super.toString()
                + " Poster ad: dimensions =" + dimensions
                + " Rate=" + cost();
    }
}
