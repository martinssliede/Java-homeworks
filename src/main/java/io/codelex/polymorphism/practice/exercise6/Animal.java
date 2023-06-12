package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private int foodEaten;
    private String animalLivingRegion;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }
    public abstract void makeSound();

    public void eat(String foodType, int quantity) {
        System.out.println("> " + foodType);
        if (isFoodValid(foodType)) {
            foodEaten += quantity;
        } else {
            System.out.println(getAnimalType() + " are not eating that type of food!");
        }
    };

    public abstract boolean isFoodValid(String foodType);

    public String getAnimalName() {
        return animalName;
    }

    public abstract String getAnimalType();

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    public String getAnimalLivingRegion() {
        return animalLivingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        return getAnimalType() + "[" + getAnimalName() + ", " + format.format(getAnimalWeight()) + ", " + getAnimalLivingRegion() + ", " + getFoodEaten() + "]";
    }
}
