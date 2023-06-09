package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, Nitrous{

    private String brand;
    private Integer currentSpeed = 0;

    public Lexus(String brand) {
        this.brand = brand;
    }

    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed -= 8;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }
}
