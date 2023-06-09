package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal{
    private String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight) {
        super(animalName, animalType, animalWeight);
    }
}
