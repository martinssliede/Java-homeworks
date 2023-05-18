package io.codelex.classesandobjects.practice.Exercise3;

public class FuelGauge {
    private int currentAmount;

    public int reportCurrentAmount() {
        return currentAmount;
    }

    public void fuelUp() {
        while (currentAmount < 70) {
            currentAmount++;
        }
    }

    public void fuelDown() {
        while (currentAmount > 0) {
            currentAmount--;
        }
    }

    public FuelGauge(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    @Override
    public String toString() {
        return "FuelGauge{" +
                "currentAmount=" + currentAmount +
                '}';
    }
}
