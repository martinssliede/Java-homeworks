package io.codelex.polymorphism.practice.exercise1;

public class Toyota implements Car, Nitrous{
    private String brand;
    private Integer currentSpeed = 0;

    public Toyota(String brand) {
        this.brand = brand;
    }

    public void speedUp() {
        currentSpeed += 9;
    }

    public void slowDown() {
        currentSpeed -= 9;
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
