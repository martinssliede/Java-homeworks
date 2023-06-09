package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car{
    private String brand;
    private Integer currentSpeed = 0;

    public Audi(String brand) {
        this.brand = brand;
    }

    public void speedUp() {
        currentSpeed += 10;
    }

    public void slowDown() {
        currentSpeed -= 10;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }
}
