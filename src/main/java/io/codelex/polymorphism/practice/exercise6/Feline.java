package io.codelex.polymorphism.practice.exercise6;

public class Feline extends Mammal{
    public Feline(String animalName, String animalType, Double animalWeight) {
        super(animalName, animalType, animalWeight);
    }

    @Override
    public void makeSound() {

    }

    @Override
    public boolean isFoodValid(String foodType) {
        return false;
    }

    @Override
    public String getAnimalType() {
        return null;
    }
}
