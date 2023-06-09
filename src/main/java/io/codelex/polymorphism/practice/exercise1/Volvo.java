package io.codelex.polymorphism.practice.exercise1;

public class Volvo implements Car{
    private String brand;
    private Integer currentSpeed = 0;

    public Volvo(String brand) {
        this.brand = brand;
    }

    public void speedUp() {
        currentSpeed += 13;
    }

    public void slowDown() {
        currentSpeed -= 13;
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
