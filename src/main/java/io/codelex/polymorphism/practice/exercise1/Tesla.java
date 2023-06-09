package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car{
    private String brand;
    private Integer currentSpeed = 0;

    public Tesla(String brand) {
        this.brand = brand;
    }

    public void speedUp() {
        currentSpeed += 20;
    }

    public void slowDown() {
        currentSpeed -= 20;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("-- silence ---");
    }
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }
}
