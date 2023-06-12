package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Feline{
    private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }
}
