package io.codelex.classesandobjects.practice.Exercise2;


public class Car {
    private double startKilometers; // Starting odometer reading
    private double endKilometers; // Ending odometer reading
    private double liters; // Liters of gas used between the readings

    public Car(double startKilometers, double endKilometers, double liters) {
        this.startKilometers = startKilometers;
        this.endKilometers = endKilometers;
        this.liters = liters;
    }

    double calculateConsumption() {
        return (liters * 100) / (endKilometers - startKilometers);
    }

    public boolean gasHog() {
        if (calculateConsumption() > 15) {
            return true;
        } else {
            return false;
        }
    }

    public boolean economyCar() {
        if (calculateConsumption() < 5) {
            return true;
        } else {
            return false;
        }
    }
}
