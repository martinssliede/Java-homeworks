package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal{
    public Zebra(String animalName, String animalType, Double animalWeight, String animalLivingRegion) {
        super(animalName, animalType, animalWeight);
    }

    @Override
    public void makeSound() {
        System.out.println("> Eergh");
    }

    @Override
    public boolean isFoodValid(String foodType) {
        return foodType.equals("Vegetable");
    }

    @Override
    public String getAnimalType() {
        return "Zebra";
    }
}
