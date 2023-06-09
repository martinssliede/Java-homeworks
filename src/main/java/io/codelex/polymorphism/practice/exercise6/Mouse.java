package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal{
    private String animalLivingRegion;

    public Mouse(String animalName, String animalType, Double animalWeight, String animalLivingRegion) {
        super(animalName, animalType, animalWeight);
        this.animalLivingRegion = animalLivingRegion;
    }

    @Override
    public String getAnimalLivingRegion() {
        return animalLivingRegion;
    }

    @Override
    public void makeSound() {
        System.out.println("> Squeak");
    }

    @Override
    public boolean isFoodValid(String foodType) {
        return foodType.equals("Vegetable");
    }

    @Override
    public String getAnimalType() {
        return "Mouse";
    }


}
