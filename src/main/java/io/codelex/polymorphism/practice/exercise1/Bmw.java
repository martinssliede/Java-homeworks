package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car{
    private String brand;
    private Integer currentSpeed = 0;

    public Bmw(String brand) {
        this.brand = brand;
    }

    public void speedUp() {
        currentSpeed += 12;
    }

    public void slowDown() {
        currentSpeed -= 12;
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
