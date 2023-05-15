package io.codelex.classesandobjects.practice;


public class Exercise2_Car {
    double startKilometers; // Starting odometer reading
    double endKilometers; // Ending odometer reading
    double liters; // Liters of gas used between the readings

    public Exercise2_Car(double startKilometers, double endKilometers, double liters) {
        this.startKilometers = startKilometers;
        this.endKilometers = endKilometers;
        this.liters = liters;
    }

    double calculateConsumption() {
        return (endKilometers - startKilometers) / liters;
    }

    boolean gasHog() {
        if (calculateConsumption() > 15) {
            return true;
        } else {
            return false;
        }
    }

    boolean economyCar() {
        if (calculateConsumption() < 5) {
            return true;
        } else {
            return false;
        }
    }
}
