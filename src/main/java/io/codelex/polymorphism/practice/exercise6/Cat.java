package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Feline{
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String breed, String animalLivingRegion) {
        super(animalName, animalType, animalWeight);
        this.breed = breed;
    }
}
